package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aomr extends java.io.IOException {
    public aomr(java.io.File file, java.io.File file2, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(file.toString());
        if (file2 != null) {
            java.util.Objects.toString(file2);
            sb.append(" -> ".concat(file2.toString()));
        }
        sb.append(": ".concat(str));
        super(sb.toString());
    }
}
