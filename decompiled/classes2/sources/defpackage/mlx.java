package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mlx implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ mlx(j$.util.Optional optional, boolean z, android.os.Bundle bundle, android.net.Uri uri, android.content.Context context, int i) {
        this.$cid = i;
        this.b = optional;
        this.a = z;
        this.c = bundle;
        this.d = uri;
        this.e = context;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aonj, java.lang.Object] */
    public final java.lang.Object a() {
        java.util.ArrayList parcelableArrayList;
        if (this.$cid != 0) {
            int i = defpackage.bto.a;
            return new defpackage.btt(this.d, this.c, (defpackage.btu) this.e, this.b, this.a);
        }
        defpackage.mls mlsVar = null;
        if (!((j$.util.Optional) this.b).isPresent() && !this.a && ((parcelableArrayList = ((android.os.Bundle) this.c).getParcelableArrayList("selectPhoneAccountAccounts")) == null || parcelableArrayList.isEmpty())) {
            java.lang.Object obj = this.e;
            java.lang.Object obj2 = this.d;
            defpackage.mma.b.b().l("com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion", "produceMissingAccountPrompt$<anonymous>", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "DisconnectPromptProducerModule.kt").v("produce Missing account disconnect prompt");
            java.lang.String string = aooh.n("tel", ((android.net.Uri) obj2).getScheme()) ? ((android.content.Context) obj).getString(2132017613) : ((android.content.Context) obj).getString(2132019061);
            aooh.c(string);
            mlsVar = new defpackage.mls(defpackage.mlt.PROMPT_TYPE_MISSING_ACCOUNT, string, null, string, null, ((android.content.Context) obj).getString(android.R.string.ok), null);
        }
        return mlsVar;
    }

    public /* synthetic */ mlx(java.util.Set set, aomy aomyVar, defpackage.btu btuVar, aonj aonjVar, boolean z, int i) {
        this.$cid = i;
        this.d = set;
        this.c = aomyVar;
        this.e = btuVar;
        this.b = aonjVar;
        this.a = z;
    }
}
