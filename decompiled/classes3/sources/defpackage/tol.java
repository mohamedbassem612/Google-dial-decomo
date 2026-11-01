package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tol extends aomh implements aonn {
    int a;
    final /* synthetic */ aoin b;
    final /* synthetic */ boolean c;
    final /* synthetic */ amzg d;
    final /* synthetic */ boolean e;
    final /* synthetic */ aify f;
    final /* synthetic */ android.content.Context g;
    final /* synthetic */ j$.util.Optional h;
    final /* synthetic */ java.lang.String i;
    final /* synthetic */ aify j;
    final /* synthetic */ defpackage.qin k;
    final /* synthetic */ defpackage.qir l;
    final /* synthetic */ defpackage.qiy m;
    final /* synthetic */ aify n;
    final /* synthetic */ android.app.PendingIntent o;
    final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tol(aoin aoinVar, boolean z, amzg amzgVar, boolean z2, aify aifyVar, android.content.Context context, j$.util.Optional optional, java.lang.String str, aify aifyVar2, defpackage.qin qinVar, defpackage.qir qirVar, defpackage.qiy qiyVar, aify aifyVar3, android.app.PendingIntent pendingIntent, boolean z3, aoln aolnVar) {
        super(2, aolnVar);
        this.b = aoinVar;
        this.c = z;
        this.d = amzgVar;
        this.e = z2;
        this.f = aifyVar;
        this.g = context;
        this.h = optional;
        this.i = str;
        this.j = aifyVar2;
        this.k = qinVar;
        this.l = qirVar;
        this.m = qiyVar;
        this.n = aifyVar3;
        this.o = pendingIntent;
        this.p = z3;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objD;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            objD = obj;
        } else {
            aoin aoinVar = this.b;
            if (!((java.lang.Boolean) aoinVar.a()).booleanValue() || this.c) {
                boolean z = this.e;
                return new defpackage.qjd(defpackage.qit.SHARPIE, this.i, this.j, z ? aokc.a : this.f, this.k, this.l, true != ((java.lang.Boolean) aoinVar.a()).booleanValue() ? 2131232043 : 2131231037, this.m, "phone_ongoing_call", null, urg.c(this.g, 2130968952), true, 4, true != z ? 4 : 0, this.n, null, this.o, null, null, this.p, new defpackage.qiz(defpackage.qid.DISCONNECT, defpackage.qim.SHARPIE_NOTIFICATION_PRIORITY), null, false, false, !z, false, false, (defpackage.qie) aooh.q(this.h), 103186944);
            }
            ajcq ajcqVarD = this.d.d();
            this.a = 1;
            objD = aosv.D(ajcqVarD, this);
            if (objD == aoluVar) {
                return aoluVar;
            }
        }
        aooh.e(objD, "await(...)");
        return defpackage.qjd.d((defpackage.qjd) objD, defpackage.qit.SHARPIE_RUNNING, 2131231037, false, 268435390);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.tol(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, aolnVar);
    }
}
