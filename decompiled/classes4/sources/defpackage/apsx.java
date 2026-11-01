package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apsx extends java.lang.Error {
    private static final long serialVersionUID = 1;

    public apsx(boolean z, int i, int i2, java.lang.String str, char c) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lexical error at line ");
        sb.append(i);
        sb.append(", column ");
        sb.append(i2);
        sb.append(".  Encountered: ");
        if (z) {
            str2 = "<EOF> ";
        } else {
            str2 = "\"" + a(java.lang.String.valueOf(c)) + "\" (" + ((int) c) + "), ";
        }
        sb.append(str2);
        sb.append("after : \"");
        sb.append(a(str));
        sb.append('\"');
        super(sb.toString());
    }

    protected static final java.lang.String a(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0) {
                if (cCharAt == '\"') {
                    stringBuffer.append("\\\"");
                } else if (cCharAt == '\'') {
                    stringBuffer.append("\\'");
                } else if (cCharAt == '\\') {
                    stringBuffer.append("\\\\");
                } else if (cCharAt == '\f') {
                    stringBuffer.append("\\f");
                } else if (cCharAt != '\r') {
                    switch (cCharAt) {
                        case '\b':
                            stringBuffer.append("\\b");
                            break;
                        case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                            stringBuffer.append("\\t");
                            break;
                        case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                            stringBuffer.append("\\n");
                            break;
                        default:
                            char cCharAt2 = str.charAt(i);
                            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                                java.lang.String strConcat = "0000".concat(java.lang.String.valueOf(java.lang.Integer.toString(cCharAt2, 16)));
                                stringBuffer.append("\\u".concat(java.lang.String.valueOf(strConcat.substring(strConcat.length() - 4, strConcat.length()))));
                            } else {
                                stringBuffer.append(cCharAt2);
                            }
                            break;
                    }
                } else {
                    stringBuffer.append("\\r");
                }
            }
        }
        return stringBuffer.toString();
    }
}
