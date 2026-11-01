package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jdl extends aomh implements aonn {
    int a;
    final /* synthetic */ aoin b;
    final /* synthetic */ zjl c;
    final /* synthetic */ iqm d;
    final /* synthetic */ zpo e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;
    final /* synthetic */ boolean j;
    final /* synthetic */ izg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdl(aoin aoinVar, zjl zjlVar, iqm iqmVar, zpo zpoVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, izg izgVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = aoinVar;
        this.c = zjlVar;
        this.d = iqmVar;
        this.e = zpoVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = izgVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    public final java.lang.Object b(java.lang.Object obj) {
        boolean z;
        boolean z2;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            if (i != 1) {
                z2 = ((defpackage.jhc) obj).e;
            }
            return java.lang.Boolean.valueOf(z2);
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            zjl zjlVar = this.c;
            this.a = 1;
            obj = zjlVar.c(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        } else {
            z = true;
        }
        if (!this.d.b() && this.e == zpo.d && !this.f && !this.g && !this.h && z && !this.i && !this.j) {
            izg izgVar = this.k;
            this.a = 2;
            obj = izgVar.j(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            if (((defpackage.jhc) obj).e) {
            }
        }
        return java.lang.Boolean.valueOf(z2);
        if (((java.lang.Boolean) obj).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (!this.d.b()) {
        }
        return java.lang.Boolean.valueOf(z2);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jdl(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, aolnVar);
    }
}
