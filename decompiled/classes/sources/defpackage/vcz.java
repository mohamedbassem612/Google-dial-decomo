package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vcz implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vcz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v18, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v36, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v47, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        long epochMilli;
        defpackage.akzx akzxVarM;
        java.lang.Long lValueOf;
        boolean z = false;
        defpackage.acln aclnVar = null;
        switch (this.$cid) {
            case 0:
                defpackage.vda vdaVar = (defpackage.vda) this.a;
                if (android.text.TextUtils.equals(vdaVar.d.getPackageName(), (java.lang.CharSequence) vdaVar.e.A().orElse((java.lang.Object) null))) {
                    return java.lang.Boolean.TRUE;
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vda.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/VvmServiceProviderImpl", "isDialerTheVvmPackage", (char) 267, "VvmServiceProviderImpl.java")).v("Not VVM package");
                return java.lang.Boolean.FALSE;
            case 1:
                return java.lang.Boolean.valueOf(baa$.ExternalSyntheticApiModelOutline1.m(((defpackage.vav) this.a).n));
            case 2:
                return ((defpackage.oko) this.a).A();
            case 3:
                defpackage.aogc aogcVar = (defpackage.aogc) this.a;
                java.lang.Object obj = aogcVar.c;
                defpackage.adom adomVarB = ((defpackage.adoc) aogcVar.b).b();
                adomVarB.b(defpackage.aaif.l((defpackage.aogc) obj));
                adomVarB.c(true);
                return adomVarB.a();
            case 4:
                return (defpackage.accf) this.a.a();
            case 5:
                return (java.lang.Boolean) this.a.a();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aiof aiofVar = defpackage.acea.a;
                ?? r9 = this.a;
                if (!r9.isEmpty()) {
                    for (defpackage.ajcq ajcqVar : r9) {
                        defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                        if (!((java.util.Map) defpackage.a.h(ajcqVar)).isEmpty()) {
                            z = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return (java.lang.Boolean) ((defpackage.acld) this.a).c.a();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                for (defpackage.ajcq ajcqVar2 : this.a) {
                    defpackage.ahvr.cc(ajcqVar2.isDone(), "Future was expected to be done: %s", ajcqVar2);
                    defpackage.acln aclnVar2 = (defpackage.acln) defpackage.a.h(ajcqVar2);
                    if (aclnVar2 != null) {
                        defpackage.ahvr.bZ(aclnVar == null, "More than one auth provider provided result.");
                        aclnVar = aclnVar2;
                    }
                }
                if (aclnVar == null) {
                    throw new java.lang.UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
                }
                return aclnVar;
            case 9:
                java.lang.Object obj2 = this.a;
                defpackage.adlb adlbVar = ((defpackage.adla) obj2).h;
                synchronized (adlbVar) {
                    defpackage.adla adlaVar = (defpackage.adla) adlbVar.c.remove(((defpackage.adla) obj2).a.p());
                    if (adlaVar != null) {
                        adlaVar.close();
                    }
                    break;
                }
                synchronized (obj2) {
                    defpackage.ajdd ajddVar = ((defpackage.adla) obj2).f;
                    if (ajddVar != null) {
                        ajddVar.o(null);
                    }
                    break;
                }
                return defpackage.ajcm.a;
            case 10:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.anph anphVar = new defpackage.anph();
                defpackage.anoz anozVar = defpackage.anph.b;
                int i = defpackage.anpc.d;
                defpackage.anoy anoyVar = new defpackage.anoy("x-goog-api-key", anozVar);
                defpackage.adsd adsdVar = (defpackage.adsd) this.a;
                defpackage.adoy adoyVar = (defpackage.adoy) adsdVar.b.a;
                anphVar.h(anoyVar, adoyVar.b);
                android.content.Context context = adoyVar.c;
                j$.util.Optional optionalA = defpackage.adqs.a(context);
                if (optionalA.isPresent()) {
                    anphVar.h(new defpackage.anoy("x-android-cert", anozVar), optionalA.get());
                    anphVar.h(new defpackage.anoy("x-android-package", anozVar), context.getPackageName());
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.adoy.a.d()).l("com/google/android/libraries/micore/telephony/common/app/GCloudUtils", "createManagedChannelForApiUrl", 77, "GCloudUtils.java")).v("Failed loading certificate fingerprint.");
                }
                arrayList.add(new defpackage.aohs(anphVar));
                defpackage.anot anotVarB = defpackage.anov.c().b("texttospeech.googleapis.com");
                anotVarB.e(arrayList);
                anotVarB.a();
                adsdVar.a.set(true);
                return null;
            case 11:
                return (defpackage.aemh) this.a.eZ();
            case 12:
                ((defpackage.aeni) this.a).g();
                return null;
            case 13:
                ((defpackage.aeni) this.a).g();
                return null;
            case 14:
                java.lang.Object obj3 = this.a;
                synchronized (((defpackage.afhe) obj3).b.d) {
                    ((defpackage.afhe) obj3).a = null;
                    break;
                }
                return null;
            case 15:
                return defpackage.a.m(this.a);
            case 16:
                return defpackage.aiql.H(this.a);
            case 17:
                ?? r10 = this.a;
                defpackage.ahbq ahbqVar = defpackage.ahew.k;
                if ((r10 instanceof java.util.Collection) && r10.isEmpty()) {
                    z = true;
                } else {
                    java.util.ListIterator listIterator = ((defpackage.aokv) r10).listIterator(0);
                    while (listIterator.hasNext()) {
                        java.lang.Object objH = defpackage.aiql.H((defpackage.ajcq) listIterator.next());
                        defpackage.aooh.e(objH, "getDone(...)");
                        if (!((java.lang.Boolean) objH).booleanValue()) {
                        }
                    }
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 18:
                java.lang.Object obj4 = this.a;
                defpackage.ahlm ahlmVar = (defpackage.ahlm) obj4;
                ahlmVar.b.writeLock().lock();
                try {
                    if (!((defpackage.ahlm) obj4).d.get()) {
                        try {
                            defpackage.ahmp ahmpVarA = ((defpackage.ahlm) obj4).a();
                            epochMilli = ahmpVarA.c;
                            akzxVarM = ahmpVarA.L();
                        } catch (java.io.IOException e) {
                            ((defpackage.ahlm) obj4).g(e);
                            epochMilli = j$.time.Instant.now().toEpochMilli();
                            akzxVarM = defpackage.ahmp.a.m();
                        }
                        if (epochMilli > 0) {
                            ((defpackage.ahlm) obj4).e = epochMilli;
                            ((defpackage.ahlm) obj4).d.set(true);
                            lValueOf = java.lang.Long.valueOf(((defpackage.ahlm) obj4).e);
                        } else {
                            long epochMilli2 = j$.time.Instant.now().toEpochMilli();
                            ((defpackage.ahlm) obj4).e = epochMilli2;
                            akzxVarM.u();
                            defpackage.ahmp ahmpVar = (defpackage.ahmp) akzxVarM.b;
                            ahmpVar.b |= 1;
                            ahmpVar.c = epochMilli2;
                            try {
                                try {
                                    ((defpackage.ahlm) obj4).f((defpackage.ahmp) akzxVarM.r());
                                    ((defpackage.ahlm) obj4).d.set(true);
                                } catch (java.io.IOException e2) {
                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahlm.a.d()).k(e2)).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getSyncEpoch", 124, "SyncManagerDataStore.java")).v("Could not write sync epoch. Using current time but future runs may be delayed.");
                                    ((defpackage.ahlm) obj4).d.set(false);
                                }
                                lValueOf = java.lang.Long.valueOf(((defpackage.ahlm) obj4).e);
                            } catch (java.lang.Throwable th) {
                                ((defpackage.ahlm) obj4).d.set(true);
                                throw th;
                            }
                        }
                        break;
                    } else {
                        lValueOf = java.lang.Long.valueOf(((defpackage.ahlm) obj4).e);
                    }
                    ahlmVar.b.writeLock().unlock();
                    return lValueOf;
                } catch (java.lang.Throwable th2) {
                    ahlmVar.b.writeLock().unlock();
                    throw th2;
                }
            default:
                java.lang.Object obj5 = this.a;
                synchronized (obj5) {
                    ((defpackage.ajyk) ((defpackage.ajvp) obj5).a.a()).i(java.lang.System.currentTimeMillis(), ((defpackage.ajyn) ((defpackage.ajvp) obj5).b.a()).a());
                    break;
                }
                return null;
        }
    }
}
