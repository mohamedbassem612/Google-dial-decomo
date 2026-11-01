package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acji extends aomh implements aonn {
    int a;
    final /* synthetic */ android.content.Intent b;
    final /* synthetic */ akjc c;
    final /* synthetic */ acjk d;
    final /* synthetic */ int e = 3;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acji(android.content.Intent intent, int i, akjc akjcVar, acjk acjkVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = intent;
        this.c = akjcVar;
        this.d = acjkVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0064 A[PHI: r10
      0x0064: PHI (r10v1 java.lang.Object) = (r10v0 java.lang.Object), (r10v10 java.lang.Object) binds: [B:3:0x0007, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0076 A[LOOP:1: B:14:0x0070->B:16:0x0076, LOOP_END] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.util.Iterator it;
        android.content.Intent intent = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aoss aossVar = (aoss) this.f;
            android.content.Intent intent2 = this.b;
            akjc akjcVar = this.c;
            android.os.Bundle extras = intent2.getExtras();
            akjb akjbVarB = akjb.b(akjcVar.e);
            if (akjbVarB == null) {
                akjbVarB = akjb.a;
            }
            defpackage.acla aclaVar = new defpackage.acla(extras, 3, defpackage.abxl.u(akjbVarB));
            aile aileVar = this.d.c;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aileVar, 10));
            ailj ailjVarK = aileVar.k();
            while (ailjVarK.hasNext()) {
                arrayList.add(aoov.am(aossVar, 0, new defpackage.abvg((amzq) ailjVarK.next(), aclaVar, (aoln) null, 19), 3));
            }
            this.a = 1;
            obj = aooh.v(arrayList, this);
            if (obj != intent) {
                java.util.List listBS = ajsz.bS((java.lang.Iterable) obj);
                intent = this.b;
                it = listBS.iterator();
                while (it.hasNext()) {
                    intent.putExtras((android.os.Bundle) it.next());
                }
            }
        } else {
            java.util.List listBS2 = ajsz.bS((java.lang.Iterable) obj);
            intent = this.b;
            it = listBS2.iterator();
            while (it.hasNext()) {
                intent.putExtras((android.os.Bundle) it.next());
            }
        }
        return intent;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.acji acjiVar = new defpackage.acji(this.b, 3, this.c, this.d, aolnVar);
        acjiVar.f = obj;
        return acjiVar;
    }
}
