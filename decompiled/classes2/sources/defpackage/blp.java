package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blp extends aomh implements aonn {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ defpackage.blw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blp(defpackage.blw blwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = blwVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c(new cpm(((cpm) obj).a), (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.blw blwVar;
        aoiu aoiuVarL;
        long j = this.b;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0 && (aoiuVarL = (blwVar = this.c).l()) != null) {
            java.lang.CharSequence charSequence = (dji) aoiuVarL.a;
            long j2 = ((dky) aoiuVarL.b).b;
            defpackage.bkj bkjVar = blwVar.m;
            if (bkjVar != null) {
                this.b = j;
                this.a = 1;
                java.lang.Object objE = bkjVar.e(charSequence, j2, this);
                if (objE != aoluVar) {
                    objE = aojh.a;
                }
                if (objE == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.blp blpVar = new defpackage.blp(this.c, aolnVar);
        blpVar.b = ((cpm) obj).a;
        return blpVar;
    }
}
