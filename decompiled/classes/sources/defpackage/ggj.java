package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ggj implements defpackage.aoxi {
    final /* synthetic */ defpackage.aoot a;
    final /* synthetic */ defpackage.aoxi b;
    final /* synthetic */ java.lang.String[] c;
    final /* synthetic */ int[] d;

    public ggj(defpackage.aoot aootVar, defpackage.aoxi aoxiVar, java.lang.String[] strArr, int[] iArr) {
        this.a = aootVar;
        this.b = aoxiVar;
        this.c = strArr;
        this.d = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aoxi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(int[] iArr, defpackage.aoln aolnVar) {
        defpackage.ggi ggiVar;
        if (aolnVar instanceof defpackage.ggi) {
            ggiVar = (defpackage.ggi) aolnVar;
            int i = ggiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ggiVar.c = i - Integer.MIN_VALUE;
            } else {
                ggiVar = new defpackage.ggi(this, aolnVar);
            }
        } else {
            ggiVar = new defpackage.ggi(this, aolnVar);
        }
        java.lang.Object obj = ggiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ggiVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aoot aootVar = this.a;
            if (aootVar.a == null) {
                defpackage.aoxi aoxiVar = this.b;
                java.util.Set setCW = defpackage.ajsz.cW(this.c);
                ggiVar.d = iArr;
                ggiVar.c = 1;
                if (aoxiVar.a(setCW, ggiVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                java.lang.String[] strArr = this.c;
                int[] iArr2 = this.d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = strArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    java.lang.String str = strArr[i3];
                    int i5 = i4 + 1;
                    java.lang.Object obj2 = aootVar.a;
                    if (obj2 == null) {
                        throw new java.lang.IllegalStateException("Required value was null.");
                    }
                    int i6 = iArr2[i4];
                    if (((int[]) obj2)[i6] != iArr[i6]) {
                        arrayList.add(str);
                    }
                    i3++;
                    i4 = i5;
                }
                if (!arrayList.isEmpty()) {
                    defpackage.aoxi aoxiVar2 = this.b;
                    java.util.Set setCf = defpackage.ajsz.cf(arrayList);
                    ggiVar.d = iArr;
                    ggiVar.c = 2;
                    if (aoxiVar2.a(setCf, ggiVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iArr = ggiVar.d;
            defpackage.aooc.af(obj);
        }
        this.a.a = iArr;
        return defpackage.aojh.a;
    }
}
