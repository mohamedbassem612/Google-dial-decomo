package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahdk extends aomh implements aonn {
    int a;
    final /* synthetic */ ahdl b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdk(ahdl ahdlVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = ahdlVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        if (this.a != 0) {
            aooc.af(obj);
        } else {
            aooc.af(obj);
            aoss aossVar = (aoss) this.c;
            ahdl ahdlVar = this.b;
            this.c = aossVar;
            this.a = 1;
            aosc aoscVar = new aosc(ajsz.ap(this), 1);
            aoscVar.z();
            defpackage.ahdj ahdjVar = new defpackage.ahdj((aosb) aoscVar, 0);
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(ahdjVar);
            aoov.an(aossVar, ahdlVar.d, 0, new bbf((aoln) null, 19, (byte[]) null, (byte[]) null), 2);
            aoscVar.d(new abli(ahdjVar, 17));
            if (aoscVar.k() == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ahdk ahdkVar = new defpackage.ahdk(this.b, aolnVar);
        ahdkVar.c = obj;
        return ahdkVar;
    }
}
