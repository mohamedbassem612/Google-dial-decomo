package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aasl {
    public static final defpackage.aasl a = new defpackage.aasl();
    private java.util.regex.Pattern[] b = new java.util.regex.Pattern[0];
    private java.lang.String[] c = new java.lang.String[0];

    private aasl() {
    }

    public final synchronized java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        while (true) {
            java.util.regex.Pattern[] patternArr = this.b;
            if (i >= patternArr.length) {
                return str;
            }
            str = patternArr[i].matcher(str).replaceAll(this.c[i]);
            i++;
        }
    }

    public final synchronized void b(java.lang.String[] strArr, java.lang.String[] strArr2) {
        int length = strArr.length;
        aais.ai(length == strArr2.length);
        this.b = new java.util.regex.Pattern[length];
        this.c = strArr2;
        for (int i = 0; i < strArr.length; i++) {
            this.b[i] = java.util.regex.Pattern.compile(strArr[i]);
        }
    }
}
