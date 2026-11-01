package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apsu extends defpackage.aprw {
    private static final long serialVersionUID = 1;
    protected final boolean a;
    public defpackage.apsw b;
    public int[][] c;
    public java.lang.String[] d;
    protected final java.lang.String e;

    public apsu(defpackage.apsw apswVar, int[][] iArr, java.lang.String[] strArr) {
        super("");
        this.e = java.lang.System.getProperty("line.separator", "\n");
        this.a = true;
        this.b = apswVar;
        this.c = iArr;
        this.d = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x015a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0172  */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x015a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0172, please report this as an issue */
    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.String str;
        java.lang.String string;
        java.lang.String str2;
        int[] iArr;
        int length;
        if (!this.a) {
            return super.getMessage();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i = 0;
        int i2 = 0;
        while (true) {
            int[][] iArr2 = this.c;
            if (i >= iArr2.length) {
                break;
            }
            int length2 = iArr2[i].length;
            if (i2 < length2) {
                i2 = length2;
            }
            int i3 = 0;
            while (true) {
                iArr = this.c[i];
                length = iArr.length;
                if (i3 >= length) {
                    break;
                }
                stringBuffer.append(this.d[iArr[i3]]);
                stringBuffer.append(" ");
                i3++;
            }
            if (iArr[length - 1] != 0) {
                stringBuffer.append("...");
            }
            stringBuffer.append(this.e);
            stringBuffer.append("    ");
            i++;
        }
        defpackage.apsw apswVar = this.b.e;
        java.lang.String strConcat = "Encountered \"";
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 != 0) {
                strConcat = strConcat.concat(" ");
            }
            if (apswVar.a == 0) {
                strConcat = strConcat.concat(java.lang.String.valueOf(this.d[0]));
                java.lang.String str3 = strConcat + "\" at line " + this.b.e.b + ", column " + this.b.e.c;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str3);
                sb.append('.');
                str = this.e;
                sb.append(str);
                string = sb.toString();
                if (this.c.length == 1) {
                    str2 = string + "Was expecting:" + str + "    ";
                } else {
                    str2 = string + "Was expecting one of:" + str + "    ";
                }
                return str2.concat(stringBuffer.toString());
            }
            java.lang.String str4 = apswVar.d;
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            for (int i5 = 0; i5 < str4.length(); i5++) {
                char cCharAt = str4.charAt(i5);
                if (cCharAt != 0) {
                    if (cCharAt == '\"') {
                        stringBuffer2.append("\\\"");
                    } else if (cCharAt == '\'') {
                        stringBuffer2.append("\\'");
                    } else if (cCharAt == '\\') {
                        stringBuffer2.append("\\\\");
                    } else if (cCharAt == '\f') {
                        stringBuffer2.append("\\f");
                    } else if (cCharAt != '\r') {
                        switch (cCharAt) {
                            case '\b':
                                stringBuffer2.append("\\b");
                                break;
                            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                                stringBuffer2.append("\\t");
                                break;
                            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                                stringBuffer2.append("\\n");
                                break;
                            default:
                                char cCharAt2 = str4.charAt(i5);
                                if (cCharAt2 < ' ' || cCharAt2 > '~') {
                                    java.lang.String strConcat2 = "0000".concat(java.lang.String.valueOf(java.lang.Integer.toString(cCharAt2, 16)));
                                    stringBuffer2.append("\\u".concat(java.lang.String.valueOf(strConcat2.substring(strConcat2.length() - 4, strConcat2.length()))));
                                } else {
                                    stringBuffer2.append(cCharAt2);
                                }
                                break;
                        }
                    } else {
                        stringBuffer2.append("\\r");
                    }
                }
            }
            strConcat = strConcat.concat(stringBuffer2.toString());
            apswVar = apswVar.e;
        }
        java.lang.String str5 = strConcat + "\" at line " + this.b.e.b + ", column " + this.b.e.c;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str5);
        sb2.append('.');
        str = this.e;
        sb2.append(str);
        string = sb2.toString();
        if (this.c.length == 1) {
            str2 = string + "Was expecting:" + str + "    ";
        } else {
            str2 = string + "Was expecting one of:" + str + "    ";
        }
        return str2.concat(stringBuffer.toString());
    }

    public apsu(java.lang.String str) {
        super(str);
        this.e = java.lang.System.getProperty("line.separator", "\n");
        this.a = false;
    }

    public apsu() {
        super("Cannot parse field");
        this.e = java.lang.System.getProperty("line.separator", "\n");
        this.a = false;
    }
}
