package adapter_pattern_mediaplayer_good_ex;

public class MediaFormatDedector {

	public static boolean verifyMediaFormat(String mediaType, String media) {
	      int dotIndex = media.indexOf('.');
	      String extension = media.substring(dotIndex);

	      if (extension.equals(mediaType)) {
	         return true;
	      }
	      return false;
	   }
	
}
