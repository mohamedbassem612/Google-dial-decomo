package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apvr {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public apvr(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\.");
        this.a = java.lang.Integer.parseInt(strArrSplit[0]);
        this.b = java.lang.Integer.parseInt(strArrSplit[1]);
        this.c = java.lang.Integer.parseInt(strArrSplit[2]);
        this.d = java.lang.Integer.parseInt(strArrSplit[3]);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        sb.append('.');
        sb.append(this.d);
        return sb.toString();
    }
}
