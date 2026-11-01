package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abmt implements aono {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ abms b;
    public final /* synthetic */ long c;
    public final /* synthetic */ dot d;

    public /* synthetic */ abmt(java.lang.String str, abms abmsVar, long j, dot dotVar) {
        this.a = str;
        this.b = abmsVar;
        this.c = j;
        this.d = dotVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        awv awvVar = (awv) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f(awvVar, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != cavVar.B(awvVar) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            dot dotVar = this.d;
            long j = this.c;
            abms abmsVar = this.b;
            java.lang.String str = this.a;
            abmr abmrVarT = abts.T(xa.i(cavVar), str, abmsVar, awvVar.c);
            abrz.k(str, azm.d(cmw.c, 1.0f), j, 0L, (dnd) null, (dmq) null, 0L, dotVar, 0L, 2, false, abmrVarT.b, 0, (aonj) null, abmrVarT.a, cavVar, 48, 0, 109560);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
