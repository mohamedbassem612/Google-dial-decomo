package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fny extends defpackage.fnr {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("(.+?)='(.*?)';", 32);
    private final java.nio.charset.CharsetDecoder b = java.nio.charset.StandardCharsets.UTF_8.newDecoder();
    private final java.nio.charset.CharsetDecoder c = java.nio.charset.StandardCharsets.ISO_8859_1.newDecoder();

    private final java.lang.String c(java.nio.ByteBuffer byteBuffer) {
        java.lang.String string;
        try {
            string = this.b.decode(byteBuffer).toString();
            this.b.reset();
            byteBuffer.rewind();
        } catch (java.nio.charset.CharacterCodingException unused) {
            this.b.reset();
            byteBuffer.rewind();
            try {
                string = this.c.decode(byteBuffer).toString();
            } catch (java.nio.charset.CharacterCodingException unused2) {
                string = null;
            } finally {
                this.c.reset();
                byteBuffer.rewind();
            }
        } catch (java.lang.Throwable th) {
            this.b.reset();
            byteBuffer.rewind();
            throw th;
        }
        return string;
    }

    @Override // defpackage.fnr
    protected final defpackage.eqy b(defpackage.fnp fnpVar, java.nio.ByteBuffer byteBuffer) {
        java.lang.String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        java.lang.String str = null;
        if (strC == null) {
            return new defpackage.eqy(-9223372036854775807L, new defpackage.foa(bArr, null, null));
        }
        java.util.regex.Matcher matcher = a.matcher(strC);
        java.lang.String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            java.lang.String strGroup = matcher.group(1);
            java.lang.String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                java.lang.String strP = ahvr.p(strGroup);
                int iHashCode = strP.hashCode();
                if (iHashCode != -315603473) {
                    if (iHashCode == 1646559960 && strP.equals("streamtitle")) {
                        str = strGroup2;
                    }
                } else if (strP.equals("streamurl")) {
                    str2 = strGroup2;
                }
            }
        }
        return new defpackage.eqy(-9223372036854775807L, new defpackage.foa(bArr, str, str2));
    }
}
