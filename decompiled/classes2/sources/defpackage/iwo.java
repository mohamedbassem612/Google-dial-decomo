package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iwo extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ aoin b;
    final /* synthetic */ zjl c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwo(aoin aoinVar, zjl zjlVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoinVar;
        this.c = zjlVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    public final java.lang.Object b(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.a;
            aooc.af(obj);
            if (i != 0) {
                if (((java.lang.Boolean) obj).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else if (((java.lang.Boolean) this.b.a()).booleanValue()) {
                zjl zjlVar = this.c;
                this.a = 1;
                obj = zjlVar.c(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = true;
            }
            return java.lang.Boolean.valueOf((this.d || this.e || this.f || !z2 || this.g || this.h) ? false : true);
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.a;
        aooc.af(obj);
        if (i2 != 0) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        } else if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            zjl zjlVar2 = this.c;
            this.a = 1;
            obj = zjlVar2.c(this);
            if (obj == aoluVar2) {
                return aoluVar2;
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        return java.lang.Boolean.valueOf((this.d || this.e || this.f || !z || this.g || this.h) ? false : true);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return this.$cid != 0 ? new defpackage.iwo(this.b, this.c, this.d, this.e, this.f, this.g, this.h, aolnVar, 1, null) : new defpackage.iwo(this.b, this.c, this.d, this.e, this.f, this.g, this.h, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwo(aoin aoinVar, zjl zjlVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoinVar;
        this.c = zjlVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }
}
