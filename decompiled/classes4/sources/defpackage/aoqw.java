package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoqw implements java.util.Iterator, aoow {
    final /* synthetic */ defpackage.aoqx a;
    private int b = -1;
    private int c;
    private int d;
    private aopq e;
    private int f;

    public aoqw(defpackage.aoqx aoqxVar) {
        this.a = aoqxVar;
        int iW = aooc.w(0, 0, aoqxVar.a.length());
        this.c = iW;
        this.d = iW;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    private final void a() {
        java.lang.CharSequence charSequence;
        java.lang.Object objA;
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        defpackage.aoqx aoqxVar = this.a;
        int i2 = aoqxVar.b;
        if (i2 > 0) {
            int i3 = this.f + 1;
            this.f = i3;
            if (i3 < i2) {
                charSequence = aoqxVar.a;
                if (i > charSequence.length()) {
                    this.e = new aopq(this.c, aoov.v(aoqxVar.a));
                    this.d = -1;
                } else {
                    objA = aoqxVar.c.a(charSequence, java.lang.Integer.valueOf(this.d));
                    if (objA == null) {
                        this.e = new aopq(this.c, aoov.v(charSequence));
                        this.d = -1;
                    } else {
                        aoiu aoiuVar = (aoiu) objA;
                        int iIntValue = ((java.lang.Number) aoiuVar.a).intValue();
                        int iIntValue2 = ((java.lang.Number) aoiuVar.b).intValue();
                        this.e = aooc.C(this.c, iIntValue);
                        int i4 = iIntValue + iIntValue2;
                        this.c = i4;
                        this.d = i4 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            } else {
                this.e = new aopq(this.c, aoov.v(aoqxVar.a));
                this.d = -1;
            }
        } else {
            charSequence = aoqxVar.a;
            if (i > charSequence.length()) {
                this.e = new aopq(this.c, aoov.v(aoqxVar.a));
                this.d = -1;
            } else {
                objA = aoqxVar.c.a(charSequence, java.lang.Integer.valueOf(this.d));
                if (objA == null) {
                    this.e = new aopq(this.c, aoov.v(charSequence));
                    this.d = -1;
                } else {
                    aoiu aoiuVar2 = (aoiu) objA;
                    int iIntValue3 = ((java.lang.Number) aoiuVar2.a).intValue();
                    int iIntValue4 = ((java.lang.Number) aoiuVar2.b).intValue();
                    this.e = aooc.C(this.c, iIntValue3);
                    int i5 = iIntValue3 + iIntValue4;
                    this.c = i5;
                    this.d = i5 + (iIntValue4 == 0 ? 1 : 0);
                }
            }
        }
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new java.util.NoSuchElementException();
        }
        aopq aopqVar = this.e;
        aooh.d(aopqVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.e = null;
        this.b = -1;
        return aopqVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
