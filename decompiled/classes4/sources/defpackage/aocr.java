package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aocr extends defpackage.anwe {
    final /* synthetic */ defpackage.anmo a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ defpackage.aocx c;
    final /* synthetic */ defpackage.aocm d;
    final /* synthetic */ ajdd e;
    final /* synthetic */ defpackage.aodj f;
    final /* synthetic */ anph g;
    final /* synthetic */ defpackage.aocs h;
    final /* synthetic */ defpackage.apjb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aocr(defpackage.aocs aocsVar, defpackage.anmo anmoVar, defpackage.apjb apjbVar, java.lang.String str, defpackage.aocx aocxVar, defpackage.aocm aocmVar, ajdd ajddVar, defpackage.aodj aodjVar, anph anphVar) {
        super(anmoVar);
        this.a = anmoVar;
        this.i = apjbVar;
        this.b = str;
        this.c = aocxVar;
        this.d = aocmVar;
        this.e = ajddVar;
        this.f = aodjVar;
        this.g = anphVar;
        j$.util.Objects.requireNonNull(aocsVar);
        this.h = aocsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5, types: [anqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v2, types: [anqm, java.lang.Object] */
    @Override // defpackage.anwe
    public final void a() {
        ?? r4;
        int i = defpackage.aoik.a;
        try {
            defpackage.apjb apjbVarA = this.i;
            if (apjbVarA == null) {
                defpackage.anni anniVar = this.h.b.f;
                java.lang.String str = this.b;
                this.c.k();
                apjbVarA = anniVar.a(str);
            }
            if (apjbVarA == null) {
                anqw anqwVarF = anqw.j.f("Method not found: " + this.b);
                this.d.g(defpackage.aoct.c);
                this.c.e(anqwVarF, new anph());
                this.a.j(null);
                this.e.cancel(false);
                return;
            }
            defpackage.aocs aocsVar = this.h;
            defpackage.aocx aocxVar = this.c;
            defpackage.aodj aodjVar = this.f;
            aocxVar.k();
            aooc[] aoocVarArr = aodjVar.b;
            if (aoocVarArr.length > 0) {
                aooc aoocVar = aoocVarArr[0];
                throw null;
            }
            java.lang.Object obj = apjbVarA.b;
            defpackage.aoct aoctVar = aocsVar.b;
            defpackage.anqn[] anqnVarArr = aoctVar.h;
            int length = anqnVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                r4 = obj;
                defpackage.anqo anqoVar = new defpackage.anqo(anqnVarArr[i2], r4);
                i2++;
                r4 = anqoVar;
            }
            r4 = obj;
            defpackage.apjb apjbVar = new defpackage.apjb(apjbVarA.a, (java.lang.Object) r4);
            this.e.o(new defpackage.apjb(aocsVar, new defpackage.aocg(aocxVar, (defpackage.anpk) apjbVar.a, this.g, this.a, aoctVar.p, aoctVar.r), (defpackage.anqm) apjbVar.b));
        } catch (java.lang.Throwable th) {
            this.d.g(defpackage.aoct.c);
            this.c.e(anqw.d(th), new anph());
            this.a.j(null);
            this.e.cancel(false);
            throw th;
        }
    }
}
