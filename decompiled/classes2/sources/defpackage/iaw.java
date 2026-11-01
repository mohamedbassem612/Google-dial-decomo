package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class iaw implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ iaw(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x02f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        java.lang.String str;
        upy upyVar = null;
        java.lang.Object[] objArr = 0;
        int i = 19;
        int i2 = 3;
        switch (this.$cid) {
            case 0:
                defpackage.iax iaxVar = (defpackage.iax) this.b;
                if (!iaxVar.k) {
                    return ahrv.g(iaxVar.c.b()).i(new defpackage.iav(this.a, 0), ajbm.a);
                }
                defpackage.iax.a.d().i(zct.b).l("com/android/dialer/audio/impl/callaudiomanager/CallAudioImpl", "setUplinkMuted", 324, "CallAudioImpl.java").y("rejecting mute on invalidated call %s", iaxVar.j);
                return aiql.y(new defpackage.hxd("call invalidated"));
            case 1:
                defpackage.iax iaxVar2 = (defpackage.iax) this.b;
                if (!iaxVar2.k) {
                    return ahrv.g(iaxVar2.c.b()).i(new defpackage.iav(this.a, 2), ajbm.a);
                }
                defpackage.iax.a.d().i(zct.b).l("com/android/dialer/audio/impl/callaudiomanager/CallAudioImpl", "setDownlinkMuted", 300, "CallAudioImpl.java").y("rejecting mute on invalidated call %s", iaxVar2.j);
                return aiql.y(new defpackage.hxd("call invalidated"));
            case 2:
                java.lang.Object obj = this.b;
                defpackage.lej lejVar = (defpackage.lej) obj;
                pgi pgiVar = (pgi) lejVar.f.get();
                if (pgiVar != null) {
                    defpackage.lej.a.b().l("com/android/dialer/callscreen/impl/service/CachedVoicePackInterpreter", "cachedInterpreter", 89, "CachedVoicePackInterpreter.java").y("cached interpreter is already available with voice: %s", pgiVar.A());
                    return aiql.z(j$.util.Optional.of(pgiVar));
                }
                boolean z = this.a;
                defpackage.lej.a.b().l("com/android/dialer/callscreen/impl/service/CachedVoicePackInterpreter", "loadAndCacheInterpreter", 114, "CachedVoicePackInterpreter.java").v("loading voicePackInterpreter");
                ahrv ahrvVarG = ahrv.g(lejVar.b.b());
                llz llzVar = lejVar.c;
                j$.util.Objects.requireNonNull(llzVar);
                defpackage.ldp ldpVar = new defpackage.ldp(llzVar, i2);
                ajct ajctVar = lejVar.d;
                ajcq ajcqVarH = ahrvVarG.i(ldpVar, ajctVar).h(new defpackage.kxn(obj, 13), ajctVar);
                return z ? lejVar.i.q(ajcqVarH, lejVar.e, j$.util.Optional.empty(), ahqx.h(new defpackage.jnv(obj, ajcqVarH, i, objArr == true ? 1 : 0))) : ajcqVarH;
            case 3:
                return ahvr.F(new qfl(this.a, 0), (java.util.concurrent.Executor) this.b);
            case 4:
                j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Boolean.valueOf(this.a));
                szs szsVar = (szs) this.b;
                szsVar.x = optionalOf;
                ajcq ajcqVarC = szsVar.c();
                szq szqVar = new szq(szsVar, 16);
                ajcu ajcuVar = szsVar.e;
                return ahvr.I(ahvr.I(ajcqVarC, szqVar, ajcuVar), new szq(szsVar, 3), ajcuVar);
            case 5:
                boolean z2 = this.a;
                java.lang.Object obj2 = this.b;
                szs szsVar2 = (szs) obj2;
                szsVar2.C = z2;
                szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "disconnectCall", 576, "RevelioController.java").y("disconnectAsMissedCall: %b", java.lang.Boolean.valueOf(z2));
                return ahvr.I(szsVar2.F.k(), new defpackage.icz(obj2, z2, i2), szsVar2.e);
            case 6:
                java.lang.Object obj3 = this.b;
                xcy xcyVar = (xcy) obj3;
                if (!xcyVar.B) {
                    a.bI(xcy.a.d(), "stopping when no session was started", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "stop", (char) 325, "HoldForMeSession.java", zct.b);
                }
                if (xcyVar.C) {
                    xcy.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "enablePowerButtonHangsUpCall", 439, "HoldForMeSession.java").v("restoring Power Button behavior");
                    android.provider.Settings.Secure.putInt(xcyVar.g.getContentResolver(), "incall_power_button_behavior", 2);
                }
                boolean z3 = this.a;
                ahrv ahrvVarG2 = ahrv.g(xcyVar.n.a());
                xbv xbvVar = new xbv(obj3, 17);
                ajct ajctVar2 = xcyVar.p;
                return ahrvVarG2.i(xbvVar, ajctVar2).i(new defpackage.icz(obj3, z3, 6), ajctVar2).i(new xbv(obj3, 20), ajctVar2).e(java.lang.Throwable.class, new xbh(obj3, 17), ajctVar2).i(new xcu(xcyVar), ajctVar2).i(new xcv(obj3, 1), ajctVar2).i(new xcv(obj3, 0), ajctVar2).i(new xcv(obj3, 2), ajctVar2).i(new xcv(obj3, 3), ajctVar2).h(new xbh(obj3, 18), ajctVar2).i(new xbv(obj3, 18), ajctVar2).i(new xbv(obj3, 19), ajctVar2).e(java.lang.Throwable.class, new wzj(19), ajctVar2).h(new xbh(obj3, 16), ajctVar2);
            default:
                java.lang.Object obj4 = this.b;
                try {
                    java.lang.Object objA = ((aheo) obj4).h.a();
                    aooh.e(objA, "get(...)");
                    android.content.pm.PackageInfo packageInfo = (android.content.pm.PackageInfo) objA;
                    int i3 = packageInfo.versionCode;
                    android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo == null || (str = applicationInfo.dataDir) == null) {
                        throw new java.lang.IllegalStateException("PackageInfo was invalid.");
                    }
                    java.io.File file = new java.io.File(new java.io.File(str, "files"), "tiktok");
                    file.mkdirs();
                    java.io.File file2 = new java.io.File(file, ((aheo) obj4).l.r() ? afsq.Q((java.lang.String) null) : afsq.Q(agab.ap()));
                    boolean zCreateNewFile = file2.createNewFile();
                    if (!file2.exists() || !file2.isFile()) {
                        throw new java.io.IOException("Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup.");
                    }
                    java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file2, "rw");
                    if (!zCreateNewFile) {
                        try {
                            if (i3 != aheo.b(randomAccessFile)) {
                                afsq.R(randomAccessFile, -1);
                                upyVar = new upy(randomAccessFile, obj4, i3, 4);
                            } else {
                                randomAccessFile.close();
                            }
                        } catch (java.lang.Throwable th) {
                            randomAccessFile.close();
                            throw th;
                        }
                        break;
                    } else {
                        afsq.R(randomAccessFile, -1);
                        upyVar = new upy(randomAccessFile, obj4, i3, 4);
                        break;
                    }
                    if (upyVar == null) {
                        java.lang.Object objA2 = ((aheo) obj4).d.a();
                        aooh.e(objA2, "get(...)");
                        java.lang.Iterable iterable = (java.lang.Iterable) objA2;
                        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(iterable, 10));
                        java.util.Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ahvr.G(ahqx.b(new ahel((ahex) it.next(), 1, 0)), ((aheo) obj4).e));
                        }
                        return ahvr.ah(arrayList).o(new aczf(12), ajbm.a);
                    }
                    java.lang.Object objA3 = ((aheo) obj4).d.a();
                    aooh.e(objA3, "get(...)");
                    java.lang.Iterable iterable2 = (java.lang.Iterable) objA3;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(iterable2, 10));
                    java.util.Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new ahen((ahex) it2.next(), 1));
                    }
                    vto vtoVar = new vto(obj4, ahvr.bx(arrayList2), upyVar, 15);
                    agsm agsmVar = (agsm) ((aheo) obj4).f.a();
                    ajcq ajcqVarG = ahvr.G(vtoVar, ((aheo) obj4).e);
                    agsmVar.l(ajcqVarG);
                    return ajcqVarG;
                } catch (java.io.IOException e) {
                    if (this.a) {
                        android.content.Context context = ((aheo) obj4).a;
                        if (!abyl.i(context)) {
                            android.util.Log.w("StartupAfterPkgReplaced", "StartupAfterPackageReplaced failed, device was locked. Will reschedule.", e);
                        }
                        abyl.d(context, new agdr(obj4, 17));
                    } else {
                        android.util.Log.e("StartupAfterPkgReplaced", "StartupAfterPackageReplaced failed, will try again next startup: ", e);
                    }
                    return ajcm.a;
                }
        }
    }

    public /* synthetic */ iaw(boolean z, ajct ajctVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = ajctVar;
    }
}
