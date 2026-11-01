package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vuh implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ vuh(acwx acwxVar, ajcq ajcqVar, ajcq ajcqVar2, defpackage.acwb acwbVar, defpackage.acvj acvjVar, java.lang.String str, int i) {
        this.$cid = i;
        this.c = acwxVar;
        this.d = ajcqVar;
        this.e = ajcqVar2;
        this.b = acwbVar;
        this.a = acvjVar;
        this.f = str;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v14, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v19, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v26, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [ajcq, java.lang.Object] */
    public final ajcq a() throws defpackage.adbt {
        java.lang.String message = "";
        int i = this.$cid;
        int i2 = 17;
        int i3 = 12;
        if (i == 0) {
            aify aifyVar = (aify) aiql.H((java.util.concurrent.Future) this.b);
            j$.util.Optional optionalOf = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.c);
            boolean zIsEmpty = aifyVar.isEmpty();
            java.lang.Object obj = this.f;
            if (!zIsEmpty) {
                ahvr.bN(!aifyVar.isEmpty(), "Expect non-empty list of voicemail account models");
                if (!((java.lang.Boolean) (true != optionalOf.isPresent() ? optionalOf : j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(j$.util.Collection.-EL.stream((java.util.Collection) new defpackage.vmu(aifyVar, 12).a).anyMatch(new vpl((defpackage.vtt) optionalOf.get(), 6))))).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    defpackage.vtt vttVar = ((defpackage.vtu) aifyVar.get(0)).c;
                    if (vttVar == null) {
                        vttVar = defpackage.vtt.a;
                    }
                    optionalOf = j$.util.Optional.of(vttVar);
                }
                j$.util.Objects.requireNonNull(obj);
                defpackage.vdi vdiVar = new defpackage.vdi(obj, i2);
                if (true == optionalOf.isPresent()) {
                    defpackage.vtt vttVar2 = (defpackage.vtt) optionalOf.get();
                    akzx akzxVar = (akzx) vdiVar.a;
                    akzxVar.u();
                    defpackage.vts vtsVar = (defpackage.vts) akzxVar.b;
                    defpackage.vts vtsVar2 = defpackage.vts.a;
                    j$.util.Objects.requireNonNull(vttVar2);
                    vtsVar.d = vttVar2;
                    vtsVar.b |= 1;
                }
            }
            ?? r2 = this.e;
            ?? r3 = this.d;
            java.lang.Object obj2 = this.a;
            akzx akzxVar2 = (akzx) obj;
            akzxVar2.aa((java.lang.Iterable) aiql.H((java.util.concurrent.Future) r3));
            akzxVar2.ab(aifyVar);
            defpackage.vul vulVar = ((defpackage.vuk) obj2).b;
            nwv nwvVarA = vulVar.h.a();
            akzxVar2.u();
            defpackage.vts vtsVar3 = (defpackage.vts) akzxVar2.b;
            defpackage.vts vtsVar4 = defpackage.vts.a;
            vtsVar3.g = nwvVarA.a();
            vtsVar3.b |= 4;
            aify aifyVar2 = (aify) aiql.H((java.util.concurrent.Future) r2);
            aooh.f(aifyVar2, "voicemailAccounts");
            defpackage.vvk vvkVar = vulVar.n;
            return ahrv.g(aosv.F(vvkVar.d, 0, new defpackage.vvf(aifyVar2, vvkVar, null), 3)).h(new vuj(obj, 0), vulVar.d);
        }
        if (i == 1) {
            ?? r1 = this.d;
            ?? r4 = this.e;
            ?? r5 = this.f;
            ajcq ajcqVarD = r1.d();
            ajcq ajcqVarD2 = r4.d();
            ajcq ajcqVarD3 = r5.d();
            return ahvr.ak(new ajcq[]{ajcqVarD, ajcqVarD2, ajcqVarD3}).o(new kxy(ajcqVarD, ajcqVarD2, ajcqVarD3, (android.content.Context) this.a, (kxx) this.b, 0), (java.util.concurrent.Executor) this.c);
        }
        if (i == 2) {
            akzx akzxVarM = wpy.a.m();
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            akzxVarM.u();
            wpy wpyVar = akzxVarM.b;
            wpyVar.b |= 8;
            wpyVar.f = epochMilli;
            defpackage.wpu wpuVar = (defpackage.wpu) aiql.H((java.util.concurrent.Future) this.b);
            akzxVarM.u();
            wpy wpyVar2 = akzxVarM.b;
            wpyVar2.c = wpuVar.e;
            wpyVar2.b |= 1;
            defpackage.wpw wpwVar = (defpackage.wpw) aiql.H((java.util.concurrent.Future) this.c);
            akzxVarM.u();
            wpy wpyVar3 = akzxVarM.b;
            wpyVar3.g = wpwVar.e;
            wpyVar3.b |= 16;
            defpackage.wpt wptVar = (defpackage.wpt) aiql.H((java.util.concurrent.Future) this.d);
            akzxVarM.u();
            wpy wpyVar4 = akzxVarM.b;
            wpyVar4.h = wptVar.d;
            wpyVar4.b |= 32;
            boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.e)).booleanValue();
            akzxVarM.u();
            wpy wpyVar5 = akzxVarM.b;
            wpyVar5.b |= 2;
            wpyVar5.d = zBooleanValue;
            defpackage.tyz tyzVar = (defpackage.tyz) aiql.H((java.util.concurrent.Future) this.f);
            akzxVarM.u();
            wpy wpyVar6 = akzxVarM.b;
            j$.util.Objects.requireNonNull(tyzVar);
            wpyVar6.e = tyzVar;
            wpyVar6.b |= 4;
            return ((defpackage.wqa) this.a).e.c.bl(new defpackage.tbd(akzxVarM.p(), 9));
        }
        if (i == 3) {
            ?? r6 = this.d;
            if (((ahyn) aiql.H((java.util.concurrent.Future) r6)).f()) {
                return aiql.z(new defpackage.acxy((ajcq) ((ahyn) aiql.H((java.util.concurrent.Future) r6)).b()));
            }
            ?? r7 = this.e;
            if (((ahyn) aiql.H((java.util.concurrent.Future) r7)).f()) {
                return aiql.z(new defpackage.acxy((ajcq) ((ahyn) aiql.H((java.util.concurrent.Future) r7)).b()));
            }
            java.lang.Object obj3 = this.f;
            java.lang.Object obj4 = this.a;
            java.lang.Object obj5 = this.b;
            java.lang.Object obj6 = this.c;
            acwx acwxVar = (acwx) obj6;
            defpackage.acwb acwbVar = (defpackage.acwb) obj5;
            ajcq ajcqVarD4 = acwxVar.d.d(acwbVar, false);
            defpackage.wzg wzgVar = new defpackage.wzg(obj6, obj5, i3);
            java.util.concurrent.Executor executor = acwxVar.f;
            return ahvr.I(ahvr.I(ajcqVarD4, wzgVar, executor), new jsc(acwxVar, acwbVar, (defpackage.acvj) obj4, (java.lang.String) obj3, 16), executor);
        }
        if (i != 4) {
            if (i != 5) {
                return ((akxa) this.c).b((ajcq) this.a, (ajcq) this.b, (akxt) this.d, (alfr) this.f, (akxw) this.e);
            }
            java.lang.Object obj7 = this.c;
            java.lang.Object obj8 = this.b;
            if (obj8 == null) {
                obj8 = ((aeux) obj7).a;
            }
            java.lang.Object obj9 = this.a;
            amwu amwuVar = ((aeux) obj7).b;
            if (((aeuu) amwuVar.a()).a instanceof aeut) {
                java.lang.Object obj10 = this.d;
                if (obj10 != null) {
                    ((aeqq) obj9).d = (aevn) obj10;
                } else {
                    aevn aevnVarE = ((aequ) obj8).e((java.lang.String) this.e);
                    if (aevnVarE.g()) {
                        return ajcm.a;
                    }
                    ((aeqq) obj9).d = aevnVarE;
                }
            } else {
                ((aeqq) obj9).d(true);
            }
            if (!((aeuu) amwuVar.a()).b()) {
                return ajcm.a;
            }
            for (java.lang.Long l : this.f) {
            }
            return ((aequ) obj8).a(((aeqq) obj9).a());
        }
        java.lang.Object obj11 = this.d;
        java.lang.Object obj12 = this.c;
        java.lang.Object obj13 = this.b;
        java.lang.Object obj14 = this.e;
        try {
            android.net.Uri uriN = abrz.N((android.content.Context) this.a, (java.lang.String) this.f);
            java.io.InputStream inputStream = (java.io.InputStream) ((aogc) obj14).M((android.net.Uri) obj13, new affr());
            try {
                java.io.OutputStream outputStream = (java.io.OutputStream) ((aogc) obj14).M(uriN, new afft());
                try {
                    aisk.a(inputStream, outputStream);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    i2 = 0;
                } catch (java.lang.Throwable th) {
                    if (outputStream == null) {
                        throw th;
                    }
                    try {
                        outputStream.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                if (inputStream == null) {
                    throw th3;
                }
                try {
                    inputStream.close();
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (affa e) {
            message = android.text.TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
            java.lang.String str = ((defpackage.acvr) obj12).c;
            java.lang.String str2 = ((defpackage.acvu) obj11).d;
            int i4 = adbe.a;
            message = "UnsupportedFileStorageOperation was thrown: ".concat(java.lang.String.valueOf(message));
            i2 = 24;
        } catch (afex unused) {
            defpackage.acvr acvrVar = (defpackage.acvr) obj12;
            defpackage.acvu acvuVar = (defpackage.acvu) obj11;
            adbe.e("%s: Malformed lease uri file %s, file group %s", new java.lang.Object[]{"AndroidSharingUtil", acvrVar.c, acvuVar.d});
            message = java.lang.String.format("Malformed blob Uri for file %s, group %s", acvrVar.c, acvuVar.d);
        } catch (defpackage.afet unused2) {
            defpackage.acvr acvrVar2 = (defpackage.acvr) obj12;
            defpackage.acvu acvuVar2 = (defpackage.acvu) obj11;
            adbe.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", new java.lang.Object[]{"AndroidSharingUtil", acvrVar2.c, acvuVar2.d});
            message = java.lang.String.format("System limit exceeded for file %s, group %s", acvrVar2.c, acvuVar2.d);
            i2 = 25;
        } catch (java.io.IOException unused3) {
            defpackage.acvr acvrVar3 = (defpackage.acvr) obj12;
            defpackage.acvu acvuVar3 = (defpackage.acvu) obj11;
            adbe.e("%s: Failed to copy to the blobstore after download for file %s, file group %s", new java.lang.Object[]{"AndroidSharingUtil", acvrVar3.c, acvuVar3.d});
            message = java.lang.String.format("Error while copying file %s, group %s, to the shared blob storage", acvrVar3.c, acvuVar3.d);
            i2 = 22;
        }
        if (i2 == 0) {
            return ajcm.a;
        }
        throw new defpackage.adbt(i2, message);
    }

    public /* synthetic */ vuh(aeux aeuxVar, aequ aequVar, aeqq aeqqVar, aevn aevnVar, java.lang.String str, java.util.Set set, int i) {
        this.$cid = i;
        this.c = aeuxVar;
        this.b = aequVar;
        this.a = aeqqVar;
        this.d = aevnVar;
        this.e = str;
        this.f = set;
    }

    public /* synthetic */ vuh(akxa akxaVar, ajcq ajcqVar, ajcq ajcqVar2, akxt akxtVar, alfr alfrVar, akxw akxwVar, int i) {
        this.$cid = i;
        this.c = akxaVar;
        this.a = ajcqVar;
        this.b = ajcqVar2;
        this.d = akxtVar;
        this.f = alfrVar;
        this.e = akxwVar;
    }

    public /* synthetic */ vuh(amzg amzgVar, amzg amzgVar2, amzg amzgVar3, android.content.Context context, kxx kxxVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.d = amzgVar;
        this.e = amzgVar2;
        this.f = amzgVar3;
        this.a = context;
        this.b = kxxVar;
        this.c = ajctVar;
    }

    public /* synthetic */ vuh(android.content.Context context, java.lang.String str, aogc aogcVar, android.net.Uri uri, defpackage.acvr acvrVar, defpackage.acvu acvuVar, int i) {
        this.$cid = i;
        this.a = context;
        this.f = str;
        this.e = aogcVar;
        this.b = uri;
        this.c = acvrVar;
        this.d = acvuVar;
    }

    public /* synthetic */ vuh(defpackage.vuk vukVar, ajcq ajcqVar, ajcq ajcqVar2, akzx akzxVar, ajcq ajcqVar3, ajcq ajcqVar4, int i) {
        this.$cid = i;
        this.a = vukVar;
        this.b = ajcqVar;
        this.c = ajcqVar2;
        this.f = akzxVar;
        this.d = ajcqVar3;
        this.e = ajcqVar4;
    }

    public /* synthetic */ vuh(defpackage.wqa wqaVar, ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, ajcq ajcqVar4, ajcq ajcqVar5, int i) {
        this.$cid = i;
        this.a = wqaVar;
        this.b = ajcqVar;
        this.c = ajcqVar2;
        this.d = ajcqVar3;
        this.e = ajcqVar4;
        this.f = ajcqVar5;
    }
}
