package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class isf extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isf(abwd abwdVar, android.content.Context context, ptx ptxVar, pdm pdmVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = abwdVar;
        this.c = context;
        this.a = ptxVar;
        this.b = pdmVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 3) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 4) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 5) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f2  */
    /* JADX WARN: Type inference failed for: r0v25, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, zfe] */
    /* JADX WARN: Type inference failed for: r12v20, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21, types: [albh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v24, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v25, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, zfe] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        ?? r1;
        boolean z;
        int i2 = this.$cid;
        boolean z2 = false;
        if (i2 == 0) {
            aooc.af(obj);
            ish ishVar = (ish) this.a;
            j$.nio.file.Path path = j$.io.FileRetargetClass.toPath(ishVar.b.getFilesDir());
            aooh.e(path, "toPath(...)");
            j$.nio.file.Path pathF = defpackage.hhe.f(path, (android.telecom.PhoneAccountHandle) this.b, (android.net.Uri) this.c);
            if (!j$.nio.file.Files.exists(pathF, new j$.nio.file.LinkOption[0])) {
                ish.a.d().l("com/android/dialer/beesly/impl/audioprism/BeeslySingletonAudioPrismConfigProvider", "getGreetingLocalAudioUri$<anonymous>$<anonymous>", 214, "BeeslySingletonAudioPrismConfigProvider.kt").v("Legacy Greeting not locally written so Beesly couldn't find it");
                return null;
            }
            qbe qbeVarF = ishVar.f();
            if (qbeVarF != null) {
                qbeVarF.c(qbc.cy);
            }
            ishVar.c = ((voy) this.d).b;
            j$.nio.file.Path fileName = pathF.getFileName();
            if (fileName != null) {
                return fileName.toString();
            }
            return null;
        }
        if (i2 == 1) {
            aooc.af(obj);
            for (defpackage.kgo kgoVar : ((defpackage.gzh) this.b).d.values()) {
                java.lang.Object obj2 = this.c;
                aooh.c(kgoVar);
                java.lang.Object obj3 = this.a;
                java.lang.Object obj4 = this.d;
                java.lang.Object obj5 = kgoVar.b;
                aosp aospVar = hcq.a;
                try {
                    android.graphics.Typeface typefaceCreateFromAsset = android.graphics.Typeface.createFromAsset(((android.content.Context) obj2).getAssets(), ((java.lang.String) obj3) + ((java.lang.String) obj5) + ((java.lang.String) obj4));
                    try {
                        aooh.c(typefaceCreateFromAsset);
                        ?? r6 = kgoVar.a;
                        aooh.e((java.lang.Object) r6, "getStyle(...)");
                        boolean zG = aoov.G((java.lang.CharSequence) r6, "Italic", false);
                        boolean zG2 = aoov.G((java.lang.CharSequence) r6, "Bold", false);
                        if (zG) {
                            if (zG2) {
                                i = 3;
                            } else {
                                zG2 = false;
                                if (zG) {
                                    i = 2;
                                } else if (zG2) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                            }
                        } else if (zG) {
                            i = 2;
                        } else if (zG2) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i) {
                            typefaceCreateFromAsset = android.graphics.Typeface.create(typefaceCreateFromAsset, i);
                        }
                        kgoVar.c = typefaceCreateFromAsset;
                    } catch (java.lang.Exception unused) {
                        java.lang.Object obj6 = kgoVar.b;
                        java.lang.Object obj7 = kgoVar.a;
                        int i3 = defpackage.hge.a;
                    }
                } catch (java.lang.Exception unused2) {
                    int i4 = defpackage.hge.a;
                }
            }
            return aojh.a;
        }
        if (i2 == 2) {
            aooc.af(obj);
            java.io.File file = (java.io.File) this.b;
            if (!file.exists()) {
                return null;
            }
            aimz aimzVar = ixx.a;
            aimw aimwVarL = aimzVar.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BotGreetingWriter", "getSimplifiedBotGreetingIfAvailable$<anonymous>", 112, "BotGreetingWriter.kt");
            ixx ixxVar = (ixx) this.c;
            aimwVarL.y("file path: %s", ixxVar.c.getFilesDir());
            aimzVar.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BotGreetingWriter", "getSimplifiedBotGreetingIfAvailable$<anonymous>", 113, "BotGreetingWriter.kt").y("greeting File: %s", file.getAbsolutePath());
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            java.lang.String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            long j = strExtractMetadata != null ? java.lang.Long.parseLong(strExtractMetadata) : 0L;
            java.lang.Object obj8 = this.a;
            java.lang.Object obj9 = this.d;
            defpackage.ni niVarV = defpackage.hgz.V(defpackage.ixd.a.m());
            akzx akzxVarM = defpackage.ixe.a.m();
            aooh.f(akzxVarM, "builder");
            aooh.f(obj8, "value");
            akzxVarM.u();
            defpackage.ixe ixeVar = (defpackage.ixe) akzxVarM.b;
            j$.util.Objects.requireNonNull(obj8);
            ixeVar.b = (java.lang.String) obj8;
            aooh.f(obj9, "value");
            akzxVarM.u();
            defpackage.ixe ixeVar2 = (defpackage.ixe) akzxVarM.b;
            j$.util.Objects.requireNonNull(obj9);
            ixeVar2.c = (java.lang.String) obj9;
            java.lang.String string = ixxVar.d.u(file).toString();
            aooh.e(string, "toString(...)");
            aooh.f(string, "value");
            akzxVarM.u();
            defpackage.ixe ixeVar3 = (defpackage.ixe) akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            ixeVar3.d = string;
            akzxVarM.u();
            ((defpackage.ixe) akzxVarM.b).e = j / 1000;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.ixe ixeVar4 = (defpackage.ixe) aladVarP;
            aooh.f(ixeVar4, "value");
            akzx akzxVar = (akzx) niVarV.a;
            akzxVar.u();
            defpackage.ixd ixdVar = (defpackage.ixd) akzxVar.b;
            j$.util.Objects.requireNonNull(ixeVar4);
            ixdVar.c = ixeVar4;
            ixdVar.b = 1;
            return niVarV.R();
        }
        if (i2 == 3) {
            aooc.af(obj);
            defpackage.opt optVar = defpackage.opt.a;
            ptx ptxVar = (ptx) this.a;
            boolean zN = ptxVar.n();
            java.lang.Object obj10 = this.c;
            abwd abwdVar = (abwd) this.d;
            abko abkoVarD = defpackage.opt.d(abwdVar, (android.content.Context) obj10, zN, false);
            if (!ptxVar.j() && pez.au(abwdVar) != 2) {
                z2 = true;
            }
            j$.util.Optional optionalOf = j$.util.Optional.of(new pdn(abkoVarD, (pdm) this.b, z2));
            aooh.e(optionalOf, "of(...)");
            return optionalOf;
        }
        if (i2 == 4) {
            aooc.af(obj);
            this.c.b(this.d);
            this.b.b(this.a);
            return aojh.a;
        }
        if (i2 != 5) {
            aooc.af(obj);
            if (((defpackage.bwj) this.c).c()) {
                this.d.a();
            } else if (!a.C((ccp) this.b)) {
                this.a.a();
            }
            return aojh.a;
        }
        aooc.af(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((zdt) this.c).d.iterator();
        while (true) {
            r1 = this.a;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            zff zffVar = ((zdr) next).a;
            if (zffVar != null) {
                aooh.f((java.lang.Object) r1, "<this>");
                if (wsc.p((zfe) r1, zffVar)) {
                }
            }
            arrayList.add(next);
        }
        ?? r0 = this.b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj11 : arrayList) {
            zfd zfdVar = ((zdr) obj11).b;
            if (zfdVar != null) {
                aooh.f((java.lang.Object) r0, "<this>");
                if (wsc.p((zfe) r0, zfdVar)) {
                }
            }
            arrayList2.add(obj11);
        }
        ?? r12 = this.d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            aowv aowvVar = ((zdr) it2.next()).c;
            aimz aimzVar2 = zdt.a;
            aimzVar2.b().l("com/google/android/callingshared/peertopeer/capabilities/CapabilityDataCommander", "attemptToSendPayload", 97, "CapabilityDataCommander.kt").v("Sending message to channel.");
            java.lang.Object objB = aowvVar.b(new zdw((albh) r12, (zfd) r0, (zff) r1));
            if (objB instanceof aowl) {
                aowm.b(objB);
                aimzVar2.c().k(aowm.b(objB)).l("com/google/android/callingshared/peertopeer/capabilities/CapabilityDataCommander", "attemptToSendPayload$<anonymous>$<anonymous>", 104, "CapabilityDataCommander.kt").v("Broadcast of payload failed.");
            } else {
                if (objB instanceof aowk) {
                    aowm.b(objB);
                    aimzVar2.b().l("com/google/android/callingshared/peertopeer/capabilities/CapabilityDataCommander", "attemptToSendPayload$<anonymous>$<anonymous>", 108, "CapabilityDataCommander.kt").v("Channel was closed during broadcast but before removal.");
                } else {
                    z = true;
                }
                arrayList3.add(java.lang.Boolean.valueOf(z));
            }
            z = false;
            arrayList3.add(java.lang.Boolean.valueOf(z));
        }
        if (!arrayList3.isEmpty()) {
            java.util.Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (((java.lang.Boolean) it3.next()).booleanValue()) {
                    z2 = true;
                    break;
                }
            }
        }
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, rtj] */
    /* JADX WARN: Type inference failed for: r3v12, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [albh, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.a;
            java.lang.Object obj3 = this.b;
            return new defpackage.isf((ish) obj2, (android.telecom.PhoneAccountHandle) obj3, (android.net.Uri) this.c, (voy) this.d, aolnVar, 0);
        }
        if (i == 1) {
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.c;
            return new defpackage.isf((defpackage.gzh) obj4, (android.content.Context) obj5, (java.lang.String) this.a, (java.lang.String) this.d, aolnVar, 1);
        }
        if (i == 2) {
            java.lang.Object obj6 = this.b;
            java.lang.Object obj7 = this.c;
            return new defpackage.isf((java.io.File) obj6, (ixx) obj7, (java.lang.String) this.a, (java.lang.String) this.d, aolnVar, 2);
        }
        if (i == 3) {
            java.lang.Object obj8 = this.d;
            java.lang.Object obj9 = this.c;
            return new defpackage.isf((abwd) obj8, (android.content.Context) obj9, (ptx) this.a, (pdm) this.b, aolnVar, 3);
        }
        if (i == 4) {
            return new defpackage.isf((rtj) this.d, (rsd) this.a, (ccp) this.c, (ccp) this.b, aolnVar, 4);
        }
        java.lang.Object obj10 = this.c;
        if (i != 5) {
            return new defpackage.isf((defpackage.bwj) obj10, (aomy) this.d, (aomy) this.a, (ccp) this.b, aolnVar, 6);
        }
        java.lang.Object obj11 = this.a;
        return new defpackage.isf((zdt) obj10, (zff) obj11, (zfd) this.b, (albh) this.d, aolnVar, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isf(defpackage.bwj bwjVar, aomy aomyVar, aomy aomyVar2, ccp ccpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = bwjVar;
        this.d = aomyVar;
        this.a = aomyVar2;
        this.b = ccpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isf(defpackage.gzh gzhVar, android.content.Context context, java.lang.String str, java.lang.String str2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = gzhVar;
        this.c = context;
        this.a = str;
        this.d = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isf(ish ishVar, android.telecom.PhoneAccountHandle phoneAccountHandle, android.net.Uri uri, voy voyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ishVar;
        this.b = phoneAccountHandle;
        this.c = uri;
        this.d = voyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isf(java.io.File file, ixx ixxVar, java.lang.String str, java.lang.String str2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = file;
        this.c = ixxVar;
        this.a = str;
        this.d = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isf(rtj rtjVar, rsd rsdVar, ccp ccpVar, ccp ccpVar2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = rtjVar;
        this.a = rsdVar;
        this.c = ccpVar;
        this.b = ccpVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isf(zdt zdtVar, zff zffVar, zfd zfdVar, albh albhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = zdtVar;
        this.a = zffVar;
        this.b = zfdVar;
        this.d = albhVar;
    }
}
