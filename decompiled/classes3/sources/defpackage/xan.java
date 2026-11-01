package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xan {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer");
    public final defpackage.wzv b;
    public final defpackage.xav c;
    public final defpackage.xad d;
    public final android.content.Context e;
    public final rlv f;
    public final ahpz g;
    public final defpackage.ahey h;
    public boolean i = false;
    public j$.util.Optional j = j$.util.Optional.empty();
    public androidx.preference.Preference k;
    public android.support.v7.widget.RecyclerView l;
    public androidx.preference.SwitchPreference m;
    public lpa n;
    public lpa o;
    public lpa p;
    public lpa q;
    public lpa r;
    public final twp s;
    public final defpackage.rju t;
    public final ajwr u;
    public final ipc v;
    private final defpackage.wzx w;
    private final defpackage.rju x;

    public xan(android.content.Context context, defpackage.wzv wzvVar, defpackage.rju rjuVar, defpackage.xav xavVar, defpackage.xad xadVar, defpackage.rju rjuVar2, ipc ipcVar, defpackage.wzx wzxVar, rlv rlvVar, twp twpVar, ajwr ajwrVar, ahpz ahpzVar, defpackage.ahey aheyVar) {
        this.e = context;
        this.b = wzvVar;
        this.t = rjuVar;
        this.c = xavVar;
        this.d = xadVar;
        this.x = rjuVar2;
        this.v = ipcVar;
        this.w = wzxVar;
        this.f = rlvVar;
        this.s = twpVar;
        this.u = ajwrVar;
        this.g = ahpzVar;
        this.h = aheyVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajcu, java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aoin, java.lang.Object] */
    public final void a() {
        ajcq ajcqVarH;
        defpackage.rju rjuVar = this.x;
        java.lang.Object obj = rjuVar.a;
        defpackage.xad xadVar = this.d;
        lpa lpaVar = this.q;
        android.content.Context contextZ = xadVar.z();
        defpackage.wzx wzxVar = (defpackage.wzx) obj;
        if (!wzxVar.g.isPresent() || ((ajcq) wzxVar.g.orElseThrow()).isDone()) {
            aoin aoinVar = wzxVar.e;
            akzx akzxVarP = ((acux) aoinVar.a()).p();
            acuz acuzVar = ((acux) aoinVar.a()).g;
            if (acuzVar == null) {
                acuzVar = acuz.a;
            }
            akzx akzxVarP2 = acuzVar.p();
            akzxVarP2.u();
            acuz acuzVar2 = akzxVarP2.b;
            acuzVar2.d = 0;
            int i = 2;
            acuzVar2.b |= 2;
            akzxVarP.u();
            acux acuxVar = akzxVarP.b;
            acuz acuzVarP = akzxVarP2.p();
            j$.util.Objects.requireNonNull(acuzVarP);
            acuxVar.g = acuzVarP;
            acuxVar.b |= 2048;
            acux acuxVarP = akzxVarP.p();
            byte[] bArr = null;
            defpackage.aliq aliqVar = new defpackage.aliq(null, null);
            aliqVar.o(acuxVarP);
            defpackage.acuo acuoVarN = aliqVar.n();
            defpackage.acvi acviVarA = defpackage.acvj.a();
            acviVarA.c(acuxVarP.c);
            acuz acuzVar3 = acuxVarP.g;
            if (acuzVar3 == null) {
                acuzVar3 = acuz.a;
            }
            acviVarA.b(ahyn.h(acuzVar3));
            defpackage.acvj acvjVarA = acviVarA.a();
            a.bI(defpackage.wzx.a.b(), "start downloading", "com/android/incallui/atlas/ui/impl/mddresources/LegacyHoldForMeMddResourcesImpl", "downloadAll", (char) 177, "LegacyHoldForMeMddResourcesImpl.java", zct.a);
            ahrv ahrvVarG = ahrv.g(wzxVar.h.E(acuoVarN));
            defpackage.wzg wzgVar = new defpackage.wzg(obj, acvjVarA, i, bArr);
            ajbm ajbmVar = ajbm.a;
            ajcqVarH = ahrvVarG.i(wzgVar, ajbmVar).h(new defpackage.wzj(10), ajbmVar);
            wzxVar.g = j$.util.Optional.of(ajcqVarH);
        } else {
            hgb.h(defpackage.wzx.a.b(), "previous download in progress", "com/android/incallui/atlas/ui/impl/mddresources/LegacyHoldForMeMddResourcesImpl", "downloadAll", (char) 153, "LegacyHoldForMeMddResourcesImpl.java", (byte) 1, zct.a, java.util.concurrent.TimeUnit.MINUTES);
            ajcqVarH = (ajcq) wzxVar.g.orElseThrow();
        }
        fvl fvlVar = new fvl(13);
        long jLongValue = ((java.lang.Long) rjuVar.c.a()).longValue();
        ?? r1 = rjuVar.b;
        lpaVar.b(contextZ, ahrv.g(r1.b(fvlVar, jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS)).e(java.lang.Throwable.class, new defpackage.wzj(12), (java.util.concurrent.Executor) r1).i(new defpackage.wyv(ajcqVarH, 6), (java.util.concurrent.Executor) r1), new kll(this, 20), new defpackage.xah(0));
    }

    public final void b(defpackage.xam xamVar) {
        androidx.preference.SwitchPreference switchPreference = this.m;
        boolean z = xamVar.b;
        switchPreference.k(z);
        androidx.preference.SwitchPreference switchPreference2 = this.m;
        boolean z2 = xamVar.a;
        switchPreference2.I(z2);
        if (!z || !z2) {
            this.k.R(false);
            return;
        }
        this.n.b(this.d.z(), this.w.a(), new defpackage.xai(this, 1), new defpackage.taw(this, 11));
    }

    public final void c(final boolean z) {
        defpackage.xal xalVar = new defpackage.xal();
        xalVar.c(this.m.X());
        xalVar.b(((androidx.preference.TwoStatePreference) this.m).a);
        final defpackage.xam xamVarA = xalVar.a();
        this.r.b(this.d.z(), this.t.l(z ? defpackage.xap.USER_OPTED_IN : defpackage.xap.USER_OPTED_OUT), new lot() { // from class: xaj
            public final void a(java.lang.Object obj) {
                boolean z2 = z;
                defpackage.xan xanVar = this.a;
                if (z2) {
                    xanVar.f.o(rmx.eM);
                } else {
                    xanVar.f.o(rmx.eN);
                    xanVar.v.bm(rmu.v);
                }
                defpackage.xal xalVar2 = new defpackage.xal();
                xalVar2.c(true);
                xalVar2.b(z2);
                xanVar.b(xalVar2.a());
            }
        }, new los() { // from class: xaf
            public final void a(java.lang.Throwable th) {
                a.bq(defpackage.xan.a.c(), "failed to save opt-in preference", "com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer", "saveOptInPreference", (char) 391, "AtlasSettingsFragmentPeer.java", th, zct.b);
                this.a.b(xamVarA);
            }
        });
    }
}
