package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class czf implements defpackage.cze {
    public final defpackage.czs a = new defpackage.czs(null);
    public final defpackage.cxb b = new defpackage.cxb(null);
    public final defpackage.czs c = new defpackage.czs(null);
    public final defpackage.cxb d = new defpackage.cxb(null);
    private final java.lang.String e;

    public czf(java.lang.String str) {
        this.e = str;
    }

    @Override // defpackage.cze
    public final defpackage.cxb a() {
        return this.d;
    }

    @Override // defpackage.cze
    public final defpackage.cxb b() {
        return this.b;
    }

    @Override // defpackage.cze
    public final defpackage.czs c() {
        return this.a;
    }

    @Override // defpackage.cze
    public final defpackage.czs d() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.e;
        return str != null ? defpackage.a.bp((byte) 41, str, "RectRulers(") : super.toString();
    }
}
