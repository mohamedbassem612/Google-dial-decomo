package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class khi implements defpackage.lzh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aoin a;

    public khi(aoin aoinVar, int i) {
        this.$cid = i;
        this.a = aoinVar;
    }

    @Override // defpackage.lzh
    public final defpackage.khd a(kiu kiuVar) {
        if (this.$cid != 0) {
            aooh.f(kiuVar, "coalescedRow");
            defpackage.khe kheVar = (defpackage.khe) this.a.a();
            aooh.f(kiuVar, "coalescedRow");
            kgu kguVarA = kheVar.a(kiuVar);
            if (kguVarA == null) {
                return null;
            }
            java.lang.String str = defpackage.hgt.v(kiuVar) ? kguVarA.c : kguVarA.i;
            aooh.c(str);
            java.lang.String str2 = kguVarA.e;
            aooh.e(str2, "getAppDisplayName(...)");
            if (kheVar.c.b()) {
                str = kguVarA.c;
            }
            aooh.c(str);
            return kheVar.b(true, str2, str);
        }
        aooh.f(kiuVar, "coalescedRow");
        defpackage.khe kheVar2 = (defpackage.khe) this.a.a();
        aooh.f(kiuVar, "coalescedRow");
        kgu kguVarA2 = kheVar2.a(kiuVar);
        if (kguVarA2 == null) {
            return null;
        }
        java.lang.String str3 = defpackage.hgt.v(kiuVar) ? kguVarA2.i : kguVarA2.c;
        aooh.c(str3);
        java.lang.String str4 = kguVarA2.e;
        aooh.e(str4, "getAppDisplayName(...)");
        if (kheVar2.c.b()) {
            str3 = kguVarA2.c;
        }
        aooh.c(str3);
        return kheVar2.b(false, str4, str3);
    }
}
