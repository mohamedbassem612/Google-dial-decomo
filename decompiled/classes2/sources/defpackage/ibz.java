package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibz {
    static final /* synthetic */ defpackage.ibz a = new defpackage.ibz();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.ica icaVar, aoln aolnVar) {
        defpackage.iby ibyVar;
        if (aolnVar instanceof defpackage.iby) {
            ibyVar = (defpackage.iby) aolnVar;
            int i = ibyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ibyVar.c = i - Integer.MIN_VALUE;
            } else {
                ibyVar = new defpackage.iby(this, aolnVar);
            }
        } else {
            ibyVar = new defpackage.iby(this, aolnVar);
        }
        java.lang.Object obj = ibyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ibyVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return ((aoiw) obj).a;
        }
        aooc.af(obj);
        ibyVar.c = 1;
        java.lang.Object objA = icaVar.a(false, ibyVar);
        return objA != aoluVar ? objA : aoluVar;
    }
}
