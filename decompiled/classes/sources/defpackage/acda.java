package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acda implements defpackage.accr {
    private final /* synthetic */ int $cid;
    private final defpackage.acbd a;
    private final defpackage.accq b;

    public acda(defpackage.acbd acbdVar, int i, byte[] bArr) {
        this.$cid = i;
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.a = acbdVar;
        this.b = defpackage.accq.k;
    }

    @Override // defpackage.accr
    public final defpackage.accq a() {
        int i = this.$cid;
        return this.b;
    }

    @Override // defpackage.accu
    public final boolean b(akkj akkjVar, acct acctVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aooh.f(akkjVar, "triggeringConditions");
            if (acctVar.c) {
                boolean z = akkjVar.g;
                if (!z) {
                    this.a.b(acctVar.b, "Promotion needs sync to display.", new java.lang.Object[0]);
                }
                return z;
            }
        } else if (i != 1) {
            defpackage.aooh.f(akkjVar, "triggeringConditions");
            if (anfb.a.b().c()) {
                this.a.b(acctVar.b, "Promotion blocked: Minor account on device", new java.lang.Object[0]);
                return false;
            }
        } else {
            defpackage.aooh.f(akkjVar, "triggeringConditions");
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = acctVar.b;
            akjx akjxVar = promoContext.c().h;
            if (akjxVar == null) {
                akjxVar = akjx.a;
            }
            defpackage.alat<akjc> alatVar = (akjxVar.c == 2 ? (akjh) akjxVar.d : akjh.a).g;
            defpackage.aooh.e(alatVar, "getUserActionList(...)");
            if (!alatVar.isEmpty() && (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty())) {
                for (akjc akjcVar : alatVar) {
                    akix akixVar = akjcVar.c == 14 ? (akix) akjcVar.d : akix.a;
                    if ((akixVar.b == 3 ? (akjl) akixVar.c : akjl.a).d) {
                        this.a.b(promoContext, "Authenticated URL action requires signed-in user, but user is not signed in.", new java.lang.Object[0]);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public acda(defpackage.acbd acbdVar, int i) {
        this.$cid = i;
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.a = acbdVar;
        this.b = defpackage.accq.g;
    }

    public acda(defpackage.acbd acbdVar, int i, char[] cArr) {
        this.$cid = i;
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.a = acbdVar;
        this.b = defpackage.accq.j;
    }
}
