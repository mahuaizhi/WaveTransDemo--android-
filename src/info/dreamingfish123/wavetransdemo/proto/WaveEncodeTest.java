package info.dreamingfish123.wavetransdemo.proto;

/**
 * The test case for wave encoder.
 * 
 * @author Hui
 * 
 */
public class WaveEncodeTest {

	/**
	 * Test data.
	 */
	public static final char[] SDATA = { 0xFF, 0xc8, 0x29, 0x23, 0xbe, 0x84,
			0xe1, 0x6c, 0xd6, 0xae, 0x52, 0x90, 0x49, 0xf1, 0xf1, 0xbb, 0xe9,
			0xeb, 0xb3, 0xa6, 0xdb, 0x3c, 0x87, 0x0c, 0x3e, 0x99, 0x24, 0x5e,
			0x0d, 0x1c, 0x06, 0xb7, 0x47, 0xde, 0xb3, 0x12, 0x4d, 0xc8, 0x43,
			0xbb, 0x8b, 0xa6, 0x1f, 0x03, 0x5a, 0x7d, 0x09, 0x38, 0x25, 0x1f,
			0x5d, 0xd4, 0xcb, 0xfc, 0x96, 0xf5, 0x45, 0x3b, 0x13, 0x0d, 0x89,
			0x0a, 0x1c, 0xdb, 0xae, 0x32, 0x20, 0x9a, 0x50, 0xee, 0x40, 0x78,
			0x36, 0xfd, 0x12, 0x49, 0x32, 0xf6, 0x9e, 0x7d, 0x49, 0xdc, 0xad,
			0x4f, 0x14, 0xf2, 0x44, 0x40, 0x66, 0xd0, 0x6b, 0xc4, 0x30, 0xb7,
			0x32, 0x3b, 0xa1, 0x22, 0xf6, 0x22, 0x91, 0x9d, 0xe1, 0x8b, 0x1f,
			0xda, 0xb0, 0xca, 0x99, 0x02, 0xb9, 0x72, 0x9d, 0x49, 0x2c, 0x80,
			0x7e, 0xc5, 0x99, 0xd5, 0xe9, 0x80, 0xb2, 0xea, 0xc9, 0xcc, 0x53,
			0xbf, 0x67, 0xd6, 0xbf, 0x14, 0xd6, 0x7e, 0x2d, 0xdc, 0x8e, 0x66,
			0x83, 0xef, 0x57, 0x49, 0x61, 0xff, 0x69, 0x8f, 0x61, 0xcd, 0xd1,
			0x1e, 0x9d, 0x9c, 0x16, 0x72, 0x72, 0xe6, 0x1d, 0xf0, 0x84, 0x4f,
			0x4a, 0x77, 0x02, 0xd7, 0xe8, 0x39, 0x2c, 0x53, 0xcb, 0xc9, 0x12,
			0x1e, 0x33, 0x74, 0x9e, 0x0c, 0xf4, 0xd5, 0xd4, 0x9f, 0xd4, 0xa4,
			0x59, 0x7e, 0x35, 0xcf, 0x32, 0x22, 0xf4, 0xcc, 0xcf, 0xd3, 0x90,
			0x2d, 0x48, 0xd3, 0x8f, 0x75, 0xe6, 0xD9 };

	/**
	 * Test data.
	 */
	public static final char[] DDATA = { 0xFF, 0xc8, 0x29, 0x23, 0xbe, 0x84,
			0xe1, 0x6c, 0xd6, 0xae, 0x52, 0x90, 0x49, 0xf1, 0xf1, 0xbb, 0xe9,
			0xeb, 0xb3, 0xa6, 0xdb, 0x3c, 0x87, 0x0c, 0x3e, 0x99, 0x24, 0x5e,
			0x0d, 0x1c, 0x06, 0xb7, 0x47, 0xde, 0xb3, 0x12, 0x4d, 0xc8, 0x43,
			0xbb, 0x8b, 0xa6, 0x1f, 0x03, 0x5a, 0x7d, 0x09, 0x38, 0x25, 0x1f,
			0x5d, 0xd4, 0xcb, 0xfc, 0x96, 0xf5, 0x45, 0x3b, 0x13, 0x0d, 0x89,
			0x0a, 0x1c, 0xdb, 0xae, 0x32, 0x20, 0x9a, 0x50, 0xee, 0x40, 0x78,
			0x36, 0xfd, 0x12, 0x49, 0x32, 0xf6, 0x9e, 0x7d, 0x49, 0xdc, 0xad,
			0x4f, 0x14, 0xf2, 0x44, 0x40, 0x66, 0xd0, 0x6b, 0xc4, 0x30, 0xb7,
			0x32, 0x3b, 0xa1, 0x22, 0xf6, 0x22, 0x91, 0x9d, 0xe1, 0x8b, 0x1f,
			0xda, 0xb0, 0xca, 0x99, 0x02, 0xb9, 0x72, 0x9d, 0x49, 0x2c, 0x80,
			0x7e, 0xc5, 0x99, 0xd5, 0xe9, 0x80, 0xb2, 0xea, 0xc9, 0xcc, 0x53,
			0xbf, 0x67, 0xd6, 0xbf, 0x14, 0xd6, 0x7e, 0x2d, 0xdc, 0x8e, 0x66,
			0x83, 0xef, 0x57, 0x49, 0x61, 0xff, 0x69, 0x8f, 0x61, 0xcd, 0xd1,
			0x1e, 0x9d, 0x9c, 0x16, 0x72, 0x72, 0xe6, 0x1d, 0xf0, 0x84, 0x4f,
			0x4a, 0x77, 0x02, 0xd7, 0xe8, 0x39, 0x2c, 0x53, 0xcb, 0xc9, 0x12,
			0x1e, 0x33, 0x74, 0x9e, 0x0c, 0xf4, 0xd5, 0xd4, 0x9f, 0xd4, 0xa4,
			0x59, 0x7e, 0x35, 0xcf, 0x32, 0x22, 0xf4, 0xcc, 0xcf, 0xd3, 0x90,
			0x2d, 0x48, 0xd3, 0x8f, 0x75, 0xe6, 0xD9 };

	/**
	 * Compare SData with the target data.
	 * 
	 * @param tar
	 *            The target data to be compared.
	 * @return The result.
	 */
	public static boolean compareSData(byte[] tar) {
		if (tar == null) {
			return false;
		}
		if (SDATA.length != tar.length) {
			return false;
		}
		for (int i = 0; i < SDATA.length; i++) {
			if ((SDATA[i] & 0xff) != (tar[i] & 0xff)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Convert char array to byte array.
	 * 
	 * @param src
	 *            The char array to be converted.
	 * @return The result array.
	 */
	public static byte[] getBytes(char[] src) {
		byte[] ret = new byte[src.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = (byte) (src[i] & 0xff);
		}
		return ret;
	}
}
