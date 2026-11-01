package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jrv implements defpackage.gei {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jrv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.gei
    public final boolean a(androidx.preference.Preference preference) {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                rmx rmxVar = rmx.yi;
                defpackage.jrw jrwVar = (defpackage.jrw) ((defpackage.iyh) obj).a;
                jrwVar.h.o(rmxVar);
                jrwVar.c();
                return false;
            case 1:
                defpackage.jcp jcpVar = (defpackage.jcp) this.a;
                jcpVar.k.o(rmx.xI);
                ageb agebVar = new ageb(true);
                defpackage.jci jciVar = jcpVar.e;
                wsc.be((android.view.ViewGroup) jciVar.H().findViewById(android.R.id.content), agebVar);
                ryg rygVar = jcpVar.u;
                rygVar.h(4);
                java.lang.Object obj2 = rygVar.a;
                defpackage.iyc iycVarH = defpackage.hhb.h();
                az azVar = (az) obj2;
                u uVar = new u(azVar.a());
                uVar.j(jciVar);
                uVar.q(2131428927, iycVarH, (java.lang.String) null);
                uVar.o((java.lang.String) null);
                uVar.i(false, true);
                azVar.a().af();
                break;
            case 2:
                java.lang.Object obj3 = this.a;
                rmx rmxVar2 = rmx.yj;
                defpackage.jrw jrwVar2 = (defpackage.jrw) ((defpackage.iyh) obj3).a;
                jrwVar2.h.o(rmxVar2);
                jrwVar2.c();
                return false;
            case 3:
                akzx akzxVarM = defpackage.kzu.a.m();
                defpackage.kzs kzsVar = (defpackage.kzs) this.a;
                int i = kzsVar.q;
                akzxVarM.u();
                defpackage.kzu kzuVar = (defpackage.kzu) akzxVarM.b;
                kzuVar.b |= 1;
                kzuVar.c = i;
                long j = kzsVar.r;
                akzxVarM.u();
                defpackage.kzu kzuVar2 = (defpackage.kzu) akzxVarM.b;
                kzuVar2.b |= 2;
                kzuVar2.d = j;
                defpackage.kzu kzuVar3 = (defpackage.kzu) akzxVarM.p();
                defpackage.kzv kzvVar = new defpackage.kzv();
                amxr.g(kzvVar);
                ahgl.b(kzvVar, kzuVar3);
                kzvVar.r(kzsVar.e.I(), "delete_all_confirmation_dialog");
                break;
            case 4:
                ((defpackage.oiz) this.a).i.b(defpackage.oiz.b);
                break;
            case 5:
                rvz rvzVar = (rvz) this.a;
                rvzVar.e.j(zoe.M(((rvd) ((aoin) rvzVar.n.k().get(rvzVar.i.get(preference))).a()).d()), new zoe(preference.s), rvzVar.k);
                return false;
            case 6:
                uzs uzsVar = (uzs) this.a;
                ulw ulwVar = uzsVar.e;
                zjs zjsVar = (zjs) ulwVar.b;
                uzsVar.d.i(new zoe(ahvr.I(aosv.F(zjsVar.b, 0, new tyf(zjsVar, (aoln) null, 17, (byte[]) null), 3), new udu(ulwVar, 16), (java.util.concurrent.Executor) ulwVar.a)), uzsVar.b);
                break;
            case 7:
                android.content.Intent intent = new android.content.Intent("android.provider.action.SYNC_VOICEMAIL");
                aw awVar = (aw) ((vaa) this.a).a;
                intent.setPackage(awVar.z().getPackageName());
                awVar.z().sendBroadcast(intent);
                break;
            case 8:
                ((vpc) this.a).s.n(rmw.bX);
                return false;
            case 9:
                ((vpc) this.a).s.n(rmw.cs);
                return false;
            case 10:
                ((vpc) this.a).s.n(rmw.aZ);
                return false;
            case 11:
                ((vpc) this.a).s.n(rmw.aT);
                return false;
            case 12:
                vqn.a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer", "onCreatePreferences$<anonymous>", 211, "VoicemailSingleGreetingSettingsFragmentPeer.kt").v("changeGreetingPreference is clicked");
                vqn vqnVar = (vqn) this.a;
                vqnVar.c.o(rmx.jV);
                vqnVar.d();
                vqnVar.d.i(new zoe(vqnVar.e.c()), vqnVar.n);
                break;
            default:
                vqn.a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer", "onCreatePreferences$<anonymous>", 232, "VoicemailSingleGreetingSettingsFragmentPeer.kt").v("playGreetingPreference is clicked");
                java.lang.Object obj4 = this.a;
                vqn vqnVar2 = (vqn) obj4;
                vqb vqbVar = vqnVar2.h;
                if (!vqbVar.b()) {
                    java.lang.String str = vqnVar2.i;
                    if (str != null) {
                        vet vetVar = new vet(obj4, 5);
                        j$.nio.file.Path path = j$.nio.file.Paths.get(vqbVar.c.getFilesDir().toString(), new java.lang.String[]{str});
                        ahvr.bM(j$.nio.file.Files.exists(path, new j$.nio.file.LinkOption[0]));
                        vqbVar.c().f();
                        try {
                            vqbVar.c().i(path.toString());
                            vqbVar.i = false;
                            vqbVar.c().l(new tge(vqbVar, 14));
                            vqbVar.c().j(new uph(vqbVar, vetVar, 4, (byte[]) null));
                        } catch (java.io.IOException e) {
                            vqb.a.c().k(e).l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/GreetingEntryPlayer", "initialize", 113, "GreetingEntryPlayer.java").I("fail to set data with uri %s: %s", path, e.getMessage());
                        }
                        vqnVar2.f(true);
                        ((android.animation.TimeAnimator) vqnVar2.o.a).start();
                        vqnVar2.k.f(true);
                        vqnVar2.h.a();
                    }
                } else {
                    vqnVar2.d();
                }
                break;
        }
        return true;
    }
}
