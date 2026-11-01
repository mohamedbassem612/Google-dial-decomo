package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nzn implements defpackage.aoin {
    public final /* synthetic */ defpackage.ajct a;
    public final /* synthetic */ android.content.Context b;
    public final /* synthetic */ defpackage.ahzi c;
    public final /* synthetic */ defpackage.aoin d;
    public final /* synthetic */ defpackage.adae e;
    public final /* synthetic */ defpackage.ahbz f;
    public final /* synthetic */ defpackage.aogc g;

    public /* synthetic */ nzn(defpackage.aogc aogcVar, defpackage.ajct ajctVar, android.content.Context context, defpackage.ahzi ahziVar, defpackage.ahbz ahbzVar, defpackage.adae adaeVar, defpackage.aoin aoinVar) {
        this.g = aogcVar;
        this.a = ajctVar;
        this.b = context;
        this.c = ahziVar;
        this.f = ahbzVar;
        this.e = adaeVar;
        this.d = aoinVar;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        defpackage.aogc aogcVar = this.g;
        defpackage.ajct ajctVar = this.a;
        defpackage.adao adaoVar = new defpackage.adao(aogcVar, ajctVar);
        defpackage.adcm adcmVar = new defpackage.adcm();
        adcmVar.b(this.b);
        adcmVar.c = this.c;
        adcmVar.h = adaoVar;
        adcmVar.e = ajctVar;
        adcmVar.g = this.f;
        adcmVar.d = aogcVar;
        adcmVar.i = this.e;
        defpackage.aoin aoinVar = this.d;
        j$.util.Objects.requireNonNull(aoinVar);
        adcmVar.b = new defpackage.hlv(aoinVar, 19);
        adcmVar.f = defpackage.ahwt.a;
        return adcmVar.a();
    }
}
