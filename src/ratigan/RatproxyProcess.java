package ratigan;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JTextArea;

class RatproxyProcess implements Runnable {
	private JTextArea outputbox;
	private String _cmd;
	private String _outFile;

	private Process _process;

	RatproxyProcess(String cmd, JTextArea outputbox) {
		parseCmd(cmd);
		this.outputbox = outputbox;
	}

	private void parseCmd(String cmd) {
		StringBuilder sb = new StringBuilder();
		String[] parts = cmd.split( "\\s+" );
		for( int i = 0; i < parts.length; ++i ) {
			if( parts[ i ].equals( "-w" ) ) {
				this._outFile = parts[ ++i ];
			} else if( parts[ i ].equals( "-d" ) ) {
				sb.append( " -d " );
				sb.append( parts[ ++i ].replaceAll( "\"", "" ) );
			} else {
				sb.append( " " );
				sb.append( parts[ i ] );
				sb.append( " " );
			}
		}
		this._cmd = sb.toString().trim();
	}

	@Override
	public void run() {
		boolean logToFile = this._outFile != null;
		BufferedWriter bw = null;
		if( logToFile ) {
			try {
				bw = new BufferedWriter( new FileWriter( this._outFile ) );
			} catch(Exception e) { System.err.println( "Could not create outfile!" ); }
		}
		try {
			ProcessBuilder pb = new ProcessBuilder( this._cmd.split( "\\s+" ) );
			pb.redirectErrorStream();
			this._process = pb.start();
			int c;
			BufferedReader br = new BufferedReader( new InputStreamReader( this._process.getInputStream() ) );
			while((c = br.read()) != -1) {
				this.outputbox.append( (char)c + "");
				if( logToFile ) {
					try {
						bw.write( c );
					} catch(Exception e) {}
				}
			}
		} catch(Exception ignore) { ignore.printStackTrace();
		} finally {
			if( bw != null ) try{ bw.close(); } catch(Exception e) {}
		}
	}

	public void shutdown() {
		if( this._process != null ) this._process.destroy();
	}
}
