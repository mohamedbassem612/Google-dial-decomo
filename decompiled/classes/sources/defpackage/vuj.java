package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vuj implements defpackage.ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vuj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0098  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                j$.util.Optional optional = (j$.util.Optional) obj;
                j$.util.Objects.requireNonNull(obj2);
                vdi vdiVar = new vdi(obj2, 18);
                if (true == optional.isPresent()) {
                    vtx vtxVar = (vtx) optional.get();
                    defpackage.akzx akzxVar = (defpackage.akzx) vdiVar.a;
                    akzxVar.u();
                    vts vtsVar = akzxVar.b;
                    vts vtsVar2 = vts.a;
                    j$.util.Objects.requireNonNull(vtxVar);
                    vtsVar.f = vtxVar;
                    vtsVar.b |= 2;
                }
                return ((defpackage.akzx) obj2).r();
            case 1:
                ((vul) this.a).o.s(defpackage.ajcm.a, vul.a());
                return null;
            case 2:
                defpackage.aify aifyVar = (defpackage.aify) obj;
                return (defpackage.aify) j$.util.Collection.-EL.stream(aifyVar).map(new vum((vup) this.a, j$.util.Collection.-EL.stream(aifyVar).anyMatch(new defpackage.vgb(11)))).filter(new defpackage.vgb(12)).map(new vun(0)).sorted().map(new vun(2)).collect(defpackage.aido.a);
            case 3:
                ((defpackage.vva) this.a).i();
                return null;
            case 4:
                ((defpackage.vva) this.a).i();
                return null;
            case 5:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                defpackage.akzx akzxVar2 = (defpackage.akzx) this.a;
                akzxVar2.u();
                vuc vucVar = akzxVar2.b;
                vuc vucVar2 = vuc.a;
                vucVar.b |= 4;
                vucVar.e = true;
                return j$.util.Optional.of(akzxVar2.r());
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.akzx akzxVarL = ((vts) obj).L();
                akzxVarL.u();
                vts vtsVar3 = akzxVarL.b;
                java.lang.Object obj3 = this.a;
                j$.util.Objects.requireNonNull(obj3);
                vtsVar3.d = (vtt) obj3;
                vtsVar3.b |= 1;
                return akzxVarL.r();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                vts vtsVar4 = (vts) obj;
                vvm vvmVar = (vvm) this.a;
                if (((java.lang.Boolean) vvmVar.c.a()).booleanValue()) {
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    defpackage.aift aiftVar = new defpackage.aift(4);
                    for (vtu vtuVar : vtsVar4.c) {
                        j$.util.Optional optionalA = vvm.a(vtuVar.e, epochMilli);
                        i |= optionalA.isPresent() ? 1 : 0;
                        vmu vmuVar = new vmu(vtuVar, 16);
                        if (true == optionalA.isPresent()) {
                            ?? r8 = optionalA.get();
                            defpackage.akzx akzxVarL2 = ((defpackage.alad) vmuVar.a).L();
                            akzxVarL2.u();
                            akzxVarL2.b.e = defpackage.albq.a;
                            akzxVarL2.ac(r8);
                            optionalA = j$.util.Optional.ofNullable(akzxVarL2.r());
                        }
                        aiftVar.i((vtu) optionalA.orElse(vtuVar));
                    }
                    j$.util.Optional optionalA2 = vvm.a(vtsVar4.e, epochMilli);
                    if (i != 0 || !optionalA2.isEmpty()) {
                        defpackage.akzx akzxVarL3 = vtsVar4.L();
                        if (i != 0) {
                            akzxVarL3.u();
                            akzxVarL3.b.c = defpackage.albq.a;
                            akzxVarL3.ab(aiftVar.g());
                        }
                        vdi vdiVar2 = new vdi(akzxVarL3, 20);
                        if (true == optionalA2.isPresent()) {
                            ?? r2 = optionalA2.get();
                            defpackage.akzx akzxVar3 = (defpackage.akzx) vdiVar2.a;
                            akzxVar3.u();
                            akzxVar3.b.e = defpackage.albq.a;
                            akzxVar3.aa(r2);
                        }
                        vtsVar4 = (vts) akzxVarL3.r();
                    }
                }
                return vvmVar.d.get() ? defpackage.agxh.a(vtsVar4, j$.time.Instant.now()) : defpackage.agxh.b(vtsVar4);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return this.a;
            case 9:
                ((vvm) this.a).d.set(true);
                return null;
            case 10:
                return this.a.a(obj);
            case 11:
                boolean zIsPresent = ((vyj) obj).b.isPresent();
                vxq vxqVar = (vxq) this.a;
                if (zIsPresent) {
                    return vxqVar.y;
                }
                return vxqVar.y() ? vxqVar.z : vxqVar.x;
            case 12:
                java.lang.Object obj4 = this.a;
                return j$.util.Collection.-EL.stream((defpackage.aify) obj).filter(new lvq(((android.telecom.PhoneAccountHandle) obj4).getComponentName().flattenToString(), obj4, 6, (byte[]) null)).findFirst();
            case 13:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ((vzk) this.a).a = bool.booleanValue();
                return new defpackage.aile(defpackage.mni.aG(miv.b, miy.b, bool.booleanValue()));
            case 14:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                vzm vzmVar = new vzm(optionalOfNullable, jElapsedRealtime);
                java.lang.Object obj5 = this.a;
                ((vzn) obj5).a.set(vzmVar);
                vzl vzlVar = new vzl(obj5, jElapsedRealtime, 0);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj6 = optionalOfNullable.get();
                    java.lang.Object obj7 = vzlVar.b;
                    long j = vzlVar.a;
                    defpackage.akzx akzxVarM = miu.a.m();
                    akzxVarM.u();
                    miu miuVar = akzxVarM.b;
                    miuVar.b |= 64;
                    miuVar.i = j;
                    vzn vznVar = (vzn) obj7;
                    java.lang.String string = vznVar.b.getString(2132019793);
                    akzxVarM.u();
                    miu miuVar2 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(string);
                    miuVar2.b |= 2;
                    miuVar2.d = string;
                    miv mivVar = miv.c;
                    akzxVarM.u();
                    miu miuVar3 = akzxVarM.b;
                    miuVar3.c = mivVar.g;
                    miuVar3.b |= 1;
                    miy miyVar = miy.c;
                    akzxVarM.u();
                    miu miuVar4 = akzxVarM.b;
                    miuVar4.h = miyVar.g;
                    miuVar4.b |= 32;
                    java.lang.CharSequence text = ((android.content.Context) ((vqu) ((defpackage.ucm) vznVar.c.g().orElseThrow()).a).a).getText(2132020584);
                    java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[1];
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                    urv urvVar = ((urw) obj6).c;
                    if (urvVar == null) {
                        urvVar = urv.a;
                    }
                    charSequenceArr[0] = java.lang.String.valueOf(((long) urvVar.d) / 60);
                    java.lang.String string2 = android.text.TextUtils.expandTemplate(text, charSequenceArr).toString();
                    akzxVarM.u();
                    miu miuVar5 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(string2);
                    miuVar5.b |= 4;
                    miuVar5.e = string2;
                    optionalOfNullable = j$.util.Optional.ofNullable(new java.util.HashSet(new defpackage.aile(akzxVarM.r())));
                }
                return (java.util.Set) optionalOfNullable.orElse(new java.util.HashSet());
            case 15:
                return this.a.a(obj);
            case 16:
                ((wcz) this.a).c.m(defpackage.ruc.aM);
                return null;
            case 17:
                ((wcz) this.a).c.b(defpackage.ruc.aM);
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) wcz.a.d()).i(defpackage.zct.b)).k((java.lang.Exception) obj)).l("com/android/dialer/wearsender/spamandcallerid/SpamAndCallerIdInfoSender", "onCallEventInternal", 114, "SpamAndCallerIdInfoSender.java")).v("unable to send message to Wear.");
                return null;
            case 18:
                afpl afplVar = (afpl) obj;
                zul zulVar = (zul) afplVar.a;
                ((wcz) this.a).d.c(zulVar);
                ((defpackage.aimw) ((defpackage.aimw) wcz.a.b()).l("com/android/dialer/wearsender/spamandcallerid/SpamAndCallerIdInfoSender", "isWatchTetheredAndDefaultDialer", 129, "SpamAndCallerIdInfoSender.java")).y("Ping SentStatus: %s", zulVar.name());
                java.lang.Object obj8 = afplVar.b;
                j$.util.Optional optional2 = (j$.util.Optional) obj8;
                java.lang.Object objOfNullable = obj8;
                if (true == optional2.isPresent()) {
                    objOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((zuc) optional2.get()).c));
                }
                return (java.lang.Boolean) ((j$.util.Optional) objOfNullable).orElse(java.lang.Boolean.FALSE);
            case 19:
                defpackage.aify aifyVar2 = (defpackage.aify) obj;
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                int size = aifyVar2.size();
                while (i < size) {
                    sub subVar = (sub) aifyVar2.get(i);
                    j$.util.Optional optional3 = subVar.b;
                    if (optional3.isPresent()) {
                        java.lang.String str = (java.lang.String) optional3.orElseThrow();
                        j$.util.Optional optional4 = subVar.a;
                        if (optional4.isPresent()) {
                            ?? r6 = this.a;
                            if (r6.containsKey(optional4.orElseThrow())) {
                                aigbVar.i(str, (defpackage.wgi) r6.get(optional4.orElseThrow()));
                            } else {
                                aigbVar.i(str, defpackage.wgi.a);
                            }
                        } else {
                            aigbVar.i(str, defpackage.wgi.a);
                        }
                    } else {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.wgl.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/wificallingicons/impl/service/WifiCallingIconsConfigService", "getWifiCallingIconsConfigForContactDataIds", (char) 194, "WifiCallingIconsConfigService.java")).v("data id missing");
                    }
                    i++;
                }
                return aigbVar.e(true);
            default:
                return (defpackage.aigf) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).collect(defpackage.aido.b(new vun(14), new vxb(this.a, 5)));
        }
    }
}
