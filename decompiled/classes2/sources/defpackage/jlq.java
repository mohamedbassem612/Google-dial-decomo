package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jlq extends eoa {
    public final aoss a;
    public int b;
    public final defpackage.jmt c;
    public final java.util.List d;
    public final aozh e;
    public final aozj f;
    private final enr g;
    private final java.lang.Object i;
    private final zzx j;

    public jlq(aoss aossVar, zzx zzxVar, enr enrVar) {
        aooh.f(aossVar, "coroutineScope");
        aooh.f(enrVar, "savedStateHandle");
        this.a = aossVar;
        this.j = zzxVar;
        this.g = enrVar;
        java.lang.Object objA = enrVar.a("question_key");
        if (objA == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        this.i = objA;
        aigf aigfVarK = zzxVar.k();
        aooh.e(aigfVarK, "get(...)");
        java.lang.Object obj = aigfVarK.get(objA);
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        defpackage.jmt jmtVar = (defpackage.jmt) ((aoin) obj).a();
        this.c = jmtVar;
        java.util.List listC = jmtVar.c();
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listC, 10));
        int i = 0;
        for (java.lang.Object obj2 : listC) {
            int i2 = i + 1;
            if (i < 0) {
                ajsz.bh();
            }
            arrayList.add(new defpackage.jlp((defpackage.jms) obj2, i, new java.util.ArrayList()));
            i = i2;
        }
        this.d = arrayList;
        aozj aozjVarA = aozk.a(arrayList.get(this.b));
        this.f = aozjVarA;
        this.e = new aoys(aozjVarA, (aoub) null);
    }

    public final java.lang.Object a(android.content.Context context, defpackage.jlw jlwVar, aoln aolnVar) {
        java.lang.Object objB = this.c.b(context, jlwVar, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final boolean c() {
        return this.b == this.d.size() + (-1);
    }
}
