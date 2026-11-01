package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wzk {
    public static final aigf a;
    public static final aimz b;
    public final aoin c;
    public final ajct d;
    public final ajct e;
    public final ajct f;
    public final ajsz g;

    static {
        aigb aigbVar = new aigb(4);
        aigbVar.i("DOMAIN_0", "https://bg-call-donation-alpha.google.com/upload/");
        aigbVar.i("DOMAIN_D", "https://bg-call-donation-dev.goog/upload");
        aigbVar.i("DOMAIN_A", "https://bg-call-donation-alpha.goog/upload");
        aigbVar.i("DOMAIN_C", "https://bg-call-donation-canary.goog/upload");
        aigbVar.i("DOMAIN_P", "https://bg-call-donation.goog/upload");
        a = aigbVar.e(true);
        b = aimz.i("com/android/incallui/atlas/ui/impl/donation/ScottyUploadChannel");
    }

    public wzk(aoin aoinVar, ajct ajctVar, ajct ajctVar2, ajct ajctVar3, ajsz ajszVar) {
        this.c = aoinVar;
        this.d = ajctVar;
        this.e = ajctVar2;
        this.f = ajctVar3;
        this.g = ajszVar;
    }
}
