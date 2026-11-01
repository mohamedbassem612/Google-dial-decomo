package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uax implements iqf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ rlv a;

    public /* synthetic */ uax(rlv rlvVar, int i) {
        this.$cid = i;
        this.a = rlvVar;
    }

    public final albh a(albh albhVar, albh albhVar2) {
        xar xarVar;
        int i = this.$cid;
        if (i == 0) {
            uaw uawVar = (uaw) albhVar;
            xarVar = (uaw) albhVar2;
            boolean zEquals = uawVar.equals(uaw.a);
            rlv rlvVar = this.a;
            if (!zEquals) {
                defpackage.uba.a.b().l("com/android/dialer/sonic/impl/settings/SonicSettingsDataModule", "provideSonicSettingsDataStoreConfig", 55, "SonicSettingsDataModule.java").v("setting already changed, not restoring");
                rlvVar.o(rmx.ro);
                return uawVar;
            }
            defpackage.uba.a.b().l("com/android/dialer/sonic/impl/settings/SonicSettingsDataModule", "provideSonicSettingsDataStoreConfig", 50, "SonicSettingsDataModule.java").v("restoring");
            rlvVar.o(rmx.rn);
        } else if (i == 1) {
            jos josVar = (jos) albhVar;
            xarVar = (jos) albhVar2;
            boolean zEquals2 = josVar.equals(jos.a);
            rlv rlvVar2 = this.a;
            if (!zEquals2) {
                jov.a.b().l("com/android/dialer/callannouncer/impl/settings/CallAnnouncerSettingsDataModule", "provideCallAnnouncerSettingsDataStoreConfig", 59, "CallAnnouncerSettingsDataModule.java").v("settings already changed, not restoring");
                rlvVar2.o(rmx.rd);
                return josVar;
            }
            jov.a.b().l("com/android/dialer/callannouncer/impl/settings/CallAnnouncerSettingsDataModule", "provideCallAnnouncerSettingsDataStoreConfig", 54, "CallAnnouncerSettingsDataModule.java").v("restoring from backup");
            rlvVar2.o(rmx.rc);
        } else {
            if (i == 2) {
                wpy wpyVar = (wpy) albhVar;
                wpy wpyVar2 = (wpy) albhVar2;
                boolean zEquals3 = defpackage.wqk.a(wpyVar).equals(wpy.a);
                rlv rlvVar3 = this.a;
                if (!zEquals3) {
                    defpackage.wqk.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsModule", "provideConfig", 83, "XatuSettingsModule.java").v("setting already changed, not restoring");
                    rlvVar3.o(rmx.rr);
                    return wpyVar;
                }
                defpackage.wqk.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsModule", "provideConfig", 66, "XatuSettingsModule.java").v("restoring");
                rlvVar3.o(rmx.rq);
                akzx akzxVarP = wpyVar2.p();
                if ((wpyVar.b & 2) != 0) {
                    boolean z = wpyVar.d;
                    akzxVarP.u();
                    wpy wpyVar3 = akzxVarP.b;
                    wpyVar3.b |= 2;
                    wpyVar3.d = z;
                }
                if ((wpyVar.b & 4) != 0) {
                    defpackage.tyz tyzVar = wpyVar.e;
                    if (tyzVar == null) {
                        tyzVar = defpackage.tyz.a;
                    }
                    akzxVarP.u();
                    wpy wpyVar4 = akzxVarP.b;
                    j$.util.Objects.requireNonNull(tyzVar);
                    wpyVar4.e = tyzVar;
                    wpyVar4.b |= 4;
                }
                if ((wpyVar.b & 8) != 0) {
                    long j = wpyVar.f;
                    akzxVarP.u();
                    wpy wpyVar5 = akzxVarP.b;
                    wpyVar5.b |= 8;
                    wpyVar5.f = j;
                }
                return akzxVarP.p();
            }
            xar xarVar2 = (xar) albhVar;
            xarVar = (xar) albhVar2;
            boolean zEquals4 = xarVar2.equals(xar.a);
            rlv rlvVar4 = this.a;
            if (!zEquals4) {
                defpackage.xat.a.b().l("com/android/incallui/atlas/ui/impl/settings/data/AtlasSettingsDataModule", "provideAtlasSettingsDataStoreConfig", 54, "AtlasSettingsDataModule.java").v("settings changed, not restoring");
                rlvVar4.o(rmx.ru);
                return xarVar2;
            }
            defpackage.xat.a.b().l("com/android/incallui/atlas/ui/impl/settings/data/AtlasSettingsDataModule", "provideAtlasSettingsDataStoreConfig", 49, "AtlasSettingsDataModule.java").v("restoring");
            rlvVar4.o(rmx.rt);
        }
        return xarVar;
    }
}
