package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yky implements defpackage.yks {
    private final java.lang.String a;
    private final defpackage.ykv b;

    public yky(java.lang.String str, defpackage.ykv ykvVar) {
        aooh.f(str, "permission");
        this.a = str;
        this.b = ykvVar;
    }

    @Override // defpackage.yks
    public final defpackage.ykv a() {
        return this.b;
    }

    @Override // defpackage.yks
    public final java.lang.String b() {
        return this.a;
    }
}
