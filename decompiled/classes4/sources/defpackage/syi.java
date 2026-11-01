package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class syi implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ syi(defpackage.amcp amcpVar, defpackage.amcp amcpVar2, int i, int i2) {
        this.$cid = i2;
        this.b = amcpVar;
        this.c = amcpVar2;
        this.a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        int i2 = 0;
        if (i == 0) {
            return ((android.content.Context) this.b).getString(this.a, (java.lang.String) obj, this.c);
        }
        if (i == 1) {
            return ((android.content.Context) this.b).getString(this.a, (java.lang.String) obj, this.c);
        }
        defpackage.amdz amdzVar = (defpackage.amdz) obj;
        aimz aimzVar = defpackage.amev.a;
        aift aiftVar = new aift(4);
        java.lang.String str = ((defpackage.amcp) this.b).b;
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            java.lang.String str2 = ((defpackage.amcp) this.c).b;
            if (i2 >= str2.length()) {
                break;
            }
            if (str2.charAt(i2) != '.' || (i3 != length && str.charAt(i3) == '.')) {
                i3++;
            } else {
                i4++;
            }
            aiftVar.i(java.lang.Integer.valueOf(i4));
            i2++;
        }
        int i5 = this.a;
        aify aifyVarH = aiftVar.h();
        defpackage.altp altpVarA = amdzVar.a();
        int i6 = altpVarA.a;
        int iIntValue = i6 - ((java.lang.Integer) aifyVarH.get(i6 - i5)).intValue();
        int i7 = altpVarA.b;
        defpackage.altp altpVarB = defpackage.altp.b(iIntValue, i7 - ((java.lang.Integer) aifyVarH.get((i7 - 1) - i5)).intValue());
        defpackage.amft amftVarH = defpackage.amev.h((defpackage.amft) amdzVar.c().p(), str.substring(altpVarB.a - i5, altpVarB.b - i5), altpVarB);
        int i8 = amftVarH.c;
        if (i8 == 2) {
            amdx amdxVar = new amdx();
            amdxVar.d((defpackage.amgc) amftVarH.d);
            return amdxVar.c();
        }
        if (i8 == 8) {
            amdx amdxVar2 = new amdx();
            amdxVar2.b((defpackage.amgf) amftVarH.d);
            return amdxVar2.a();
        }
        if (i8 != 1) {
            defpackage.ameg.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/TimingPuncParserDecorator", "adjustToUnpunctuatedText", 123, "TimingPuncParserDecorator.java").v("No punctuation adjustment to parsed option since parsed option has no option set.");
            return amdzVar;
        }
        amdx amdxVar3 = new amdx();
        amdxVar3.f((defpackage.amfp) amftVarH.d);
        return amdxVar3.e();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ syi(android.content.Context context, int i, java.lang.String str, int i2) {
        this.$cid = i2;
        this.b = context;
        this.a = i;
        this.c = str;
    }
}
