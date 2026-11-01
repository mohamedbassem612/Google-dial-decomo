package j$.net;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class URLEncoder {
    public static final java.util.BitSet a = new java.util.BitSet(256);

    static {
        java.util.BitSet bitSet;
        for (int i = 97; i <= 122; i++) {
            a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            a.set(i2);
        }
        int i3 = 48;
        while (true) {
            bitSet = a;
            if (i3 > 57) {
                break;
            }
            bitSet.set(i3);
            i3++;
        }
        bitSet.set(32);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        if (java.lang.System.getSecurityManager() == null) {
            java.lang.System.getProperty("file.encoding");
        }
    }

    public static java.lang.String encode(java.lang.String str, java.nio.charset.Charset charset) {
        int i;
        char cCharAt;
        j$.util.Objects.requireNonNull(charset, "charset");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        java.io.CharArrayWriter charArrayWriter = new java.io.CharArrayWriter();
        int i2 = 0;
        boolean z = false;
        while (i2 < str.length()) {
            char cCharAt2 = str.charAt(i2);
            java.util.BitSet bitSet = a;
            if (bitSet.get(cCharAt2)) {
                if (cCharAt2 == ' ') {
                    cCharAt2 = '+';
                    z = true;
                }
                sb.append(cCharAt2);
                i2++;
            } else {
                do {
                    charArrayWriter.write(cCharAt2);
                    if (cCharAt2 >= 55296 && cCharAt2 <= 56319 && (i = i2 + 1) < str.length() && (cCharAt = str.charAt(i)) >= 56320 && cCharAt <= 57343) {
                        charArrayWriter.write(cCharAt);
                        i2 = i;
                    }
                    i2++;
                    if (i2 >= str.length()) {
                        break;
                    }
                    cCharAt2 = str.charAt(i2);
                } while (!bitSet.get(cCharAt2));
                charArrayWriter.flush();
                byte[] bytes = new java.lang.String(charArrayWriter.toCharArray()).getBytes(charset);
                for (int i3 = 0; i3 < bytes.length; i3++) {
                    sb.append('%');
                    char cForDigit = java.lang.Character.forDigit((bytes[i3] >> 4) & 15, 16);
                    if (java.lang.Character.isLetter(cForDigit)) {
                        cForDigit = (char) (cForDigit - ' ');
                    }
                    sb.append(cForDigit);
                    char cForDigit2 = java.lang.Character.forDigit(bytes[i3] & 15, 16);
                    if (java.lang.Character.isLetter(cForDigit2)) {
                        cForDigit2 = (char) (cForDigit2 - ' ');
                    }
                    sb.append(cForDigit2);
                }
                charArrayWriter.reset();
                z = true;
            }
        }
        return z ? sb.toString() : str;
    }

    public static java.lang.String encode(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        if (str2 != null) {
            try {
                return encode(str, java.nio.charset.Charset.forName(str2));
            } catch (java.nio.charset.IllegalCharsetNameException | java.nio.charset.UnsupportedCharsetException unused) {
                throw new java.io.UnsupportedEncodingException(str2);
            }
        }
        throw new java.lang.NullPointerException("charsetName");
    }
}
