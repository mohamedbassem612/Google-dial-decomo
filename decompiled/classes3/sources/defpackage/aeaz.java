package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeaz extends aomh implements aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ adzy f;
    final /* synthetic */ java.lang.String g;
    final /* synthetic */ java.lang.String h;
    final /* synthetic */ adao i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeaz(int i, java.lang.String str, long j, boolean z, adzy adzyVar, adao adaoVar, java.lang.String str2, java.lang.String str3, aoln aolnVar) {
        super(2, aolnVar);
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = z;
        this.f = adzyVar;
        this.i = adaoVar;
        this.g = str2;
        this.h = str3;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aegw) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aegv aegvVar;
        aooc.af(obj);
        tvn tvnVarBS = agab.bS(((aegw) this.a).p());
        tvnVarBS.H(this.b);
        tvnVarBS.F(this.c);
        tvnVarBS.I(this.d);
        tvnVarBS.C(this.e);
        adzy adzyVar = this.f;
        if (adzyVar != adzy.a) {
            adzu adzuVar = adzu.a;
            int iOrdinal = adzyVar.ordinal();
            if (iOrdinal == 1) {
                aegvVar = aegv.b;
            } else if (iOrdinal == 2) {
                aegvVar = aegv.c;
            } else if (iOrdinal != 3) {
                aegvVar = iOrdinal != 4 ? aegv.a : aegv.e;
            } else {
                aegvVar = aegv.d;
            }
            tvnVarBS.E(aegvVar);
        }
        java.lang.String str = this.g;
        if (str != null) {
            tvnVarBS.G(str);
        }
        java.lang.String str2 = this.h;
        if (str2 != null) {
            tvnVarBS.D(str2);
        }
        return tvnVarBS.z();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aeaz aeazVar = new defpackage.aeaz(this.b, this.c, this.d, this.e, this.f, this.i, this.g, this.h, aolnVar);
        aeazVar.a = obj;
        return aeazVar;
    }
}
