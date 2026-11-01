package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pmw implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ pmw(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:205:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:210:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:212:0x06dc A[LOOP:6: B:209:0x06d0->B:212:0x06dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x06df  */
    /* JADX WARN: Code duplicated, block: B:244:0x06df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x06e0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int length;
        int i;
        defpackage.qep qepVarC;
        int i2 = 13;
        boolean zN = false;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.pnb pnbVar = (defpackage.pnb) this.b;
                android.content.Context context = pnbVar.b;
                ?? r0 = this.a;
                java.lang.CharSequence charSequenceZ = pez.Z(context);
                if (r0 instanceof java.lang.String) {
                    if (charSequenceZ != null) {
                        zN = ((java.lang.String) r0).contentEquals(charSequenceZ);
                    } else if (charSequenceZ instanceof java.lang.String) {
                        zN = aooh.n((java.lang.Object) r0, charSequenceZ);
                    } else if (r0 == charSequenceZ) {
                        zN = true;
                    } else if (charSequenceZ != null) {
                        length = r0.length();
                        i = 0;
                        while (true) {
                            if (i < length) {
                                zN = true;
                            } else if (r0.charAt(i) == charSequenceZ.charAt(i)) {
                                i++;
                            }
                        }
                    }
                } else if (r0 == charSequenceZ) {
                    zN = true;
                } else if (charSequenceZ != null && r0.length() == charSequenceZ.length()) {
                    length = r0.length();
                    i = 0;
                    while (true) {
                        if (i < length) {
                            zN = true;
                        } else if (r0.charAt(i) == charSequenceZ.charAt(i)) {
                            i++;
                        }
                    }
                }
                if (zN) {
                    pnbVar.f(mce.E, null);
                    return;
                }
                return;
            case 1:
                ((defpackage.pnb) this.b).f(mce.aD, ((defpackage.pom) this.a).a);
                return;
            case 2:
                defpackage.pqm pqmVar = (defpackage.pqm) this.a;
                android.telecom.Call call = pqmVar.b;
                defpackage.zpo zpoVarA = defpackage.zpo.a(call.getState());
                java.lang.Object obj = this.b;
                if (zpoVarA != defpackage.zpo.e) {
                    pqmVar.u(5);
                    ((dsd) obj).b((java.lang.Object) null);
                    return;
                } else {
                    pqmVar.f.a(mfy.dY);
                    call.unhold();
                    pqmVar.v(13);
                    pqmVar.i.add(obj);
                    return;
                }
            case 3:
                defpackage.pqm pqmVar2 = (defpackage.pqm) this.a;
                android.telecom.Call call2 = pqmVar2.b;
                defpackage.zpo zpoVarA2 = defpackage.zpo.a(call2.getState());
                java.lang.Object obj2 = this.b;
                if (zpoVarA2 == defpackage.zpo.g) {
                    pqmVar2.v(15);
                    ((dsd) obj2).b((java.lang.Object) null);
                    return;
                } else {
                    pqmVar2.f.a(mfy.dW);
                    call2.disconnect();
                    pqmVar2.h.add(obj2);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int i4 = defpackage.pti.b;
                ?? r1 = this.a;
                if (android.text.TextUtils.isEmpty(r1)) {
                    a.bI(defpackage.qcn.a.d(), "PostCharDialogDriver#onPostDialWait: RemainingPostDialSequence is null or empty.", "com/android/dialer/incall/postchardialog/impl/PostCharDialogDriver", "onPostDialWait", '(', "PostCharDialogDriver.java", zct.b);
                    return;
                }
                java.lang.Object obj3 = this.b;
                defpackage.qcn.a.b().l("com/android/dialer/incall/postchardialog/impl/PostCharDialogDriver", "onPostDialWait", 43, "PostCharDialogDriver.java").y("Create post char dialog with remaining sequence %s.", (java.lang.Object) r1);
                defpackage.qcn qcnVar = (defpackage.qcn) obj3;
                android.content.Context context2 = qcnVar.b;
                android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.android.dialer.incall.postchardialog.impl.ui.TidepodsPostCharDialogActivity.class);
                akzx akzxVarM = defpackage.qct.a.m();
                akzxVarM.u();
                defpackage.qct qctVar = (defpackage.qct) akzxVarM.b;
                java.lang.String str = qcnVar.c;
                j$.util.Objects.requireNonNull(str);
                qctVar.b |= 1;
                qctVar.c = str;
                akzxVarM.u();
                defpackage.qct qctVar2 = (defpackage.qct) akzxVarM.b;
                j$.util.Objects.requireNonNull((java.lang.Object) r1);
                qctVar2.b |= 2;
                qctVar2.d = (java.lang.String) r1;
                ahqx.l(context2, intent.putExtra("tidepods_post_char_dialog_args", ((defpackage.qct) akzxVarM.p()).i()).setFlags(402653184));
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.ptt pttVar = (defpackage.ptt) this.b;
                defpackage.pug pugVar = pttVar.c;
                defpackage.pty ptyVar = (defpackage.pty) this.a;
                for (j$.util.Optional optionalA = pugVar.a(ptyVar); optionalA.isPresent(); optionalA = pttVar.c.a(ptyVar)) {
                    defpackage.pug pugVar2 = (defpackage.pug) optionalA.orElseThrow();
                    defpackage.ptt.a.b().l("com/android/dialer/incall/core/call/events/impl/CallEventDriver", "updateState", 98, "CallEventDriver.java").I("state %s -> %s", pttVar.c.b(), pugVar2.b());
                    pttVar.c = pugVar2;
                    mfz mfzVar = pttVar.b;
                    gus.aw(pugVar2.b());
                    mfzVar.c();
                    pugVar2.c();
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj4 = this.a;
                hwv hwvVar = (hwv) this.b;
                if (((java.util.concurrent.atomic.AtomicReference) hwvVar.b).getAndSet(obj4) != obj4) {
                    ((defpackage.ptt) hwvVar.e.a()).a();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iOrdinal = ((java.lang.Enum) this.b).ordinal();
                android.content.Context context3 = ((defpackage.pvj) this.a).b;
                if (iOrdinal == 0) {
                    android.widget.Toast.makeText(context3, 2132020755, 1).show();
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw null;
                    }
                    android.widget.Toast.makeText(context3, 2132020754, 1).show();
                    return;
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.pxo pxoVar = (defpackage.pxo) this.a;
                defpackage.pxm pxmVar = pxoVar.b;
                boolean z = pxmVar.c.get();
                java.lang.Object obj5 = this.b;
                if (z) {
                    defpackage.pxo.a.b().l("com/android/dialer/incall/dialog/service/InCallDialogsImpl", "displayDialog", 48, "InCallDialogsImpl.java").v("Display dialog");
                    pxmVar.b.set(obj5);
                    pxmVar.f.s(ajcm.a, defpackage.pxn.a);
                    return;
                } else {
                    java.lang.String str2 = ((defpackage.pxk) obj5).a.h;
                    if (str2.isEmpty()) {
                        defpackage.pxo.a.b().l("com/android/dialer/incall/dialog/service/InCallDialogsImpl", "displayDialog", 59, "InCallDialogsImpl.java").v("Try showing toast as a fallback but no toast message");
                        return;
                    } else {
                        defpackage.pxo.a.b().l("com/android/dialer/incall/dialog/service/InCallDialogsImpl", "displayDialog", 63, "InCallDialogsImpl.java").v("Show toast");
                        android.widget.Toast.makeText(pxoVar.d, str2, 1).show();
                        return;
                    }
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                qba qbaVar = (qba) this.a;
                java.util.Set set = qbaVar.d;
                java.lang.Object obj6 = this.b;
                set.add(obj6);
                if (qbaVar.c()) {
                    return;
                }
                qbaVar.b();
                ((defpackage.otz) obj6).b();
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj7 = this.a;
                qdo qdoVar = (qdo) obj7;
                defpackage.qdn qdnVar = qdoVar.j;
                java.lang.Object obj8 = this.b;
                if (qdnVar != obj8) {
                    qdoVar.c();
                    if (qdoVar.k.get() == obj8) {
                        qdoVar.j = defpackage.qdn.a;
                        return;
                    }
                    ahoq ahoqVarW = ahvr.W(583, "AccelerometerTracker_setOrientation");
                    try {
                        ((qdo) obj7).j = (defpackage.qdn) obj8;
                        ajcs ajcsVarB = ((qdo) obj7).e.b(new fvl(5), obj8 == defpackage.qdn.b ? 100L : 500L, java.util.concurrent.TimeUnit.MILLISECONDS);
                        defpackage.phr phrVar = new defpackage.phr(obj7, i2);
                        java.util.concurrent.Executor executor = ((qdo) obj7).d;
                        ajcq ajcqVarH = ahvr.H(ajcsVarB, phrVar, executor);
                        ahvr.bY(!((qdo) obj7).h.isPresent());
                        ((qdo) obj7).h = j$.util.Optional.of(ajcqVarH);
                        ((qdo) obj7).m.a(ajcqVarH);
                        ahvr.J(ajcqVarH, new kxt((qdo) obj7, 13), executor);
                        ahoqVarW.close();
                        return;
                    } catch (java.lang.Throwable th) {
                        try {
                            ahoqVarW.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.qdp qdpVar = (defpackage.qdp) this.b;
                java.util.Set set2 = qdpVar.f;
                if (set2.isEmpty()) {
                    defpackage.qdp.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/DisplayStateTracker", "registerCall", 116, "DisplayStateTracker.java").v("registering displayListener");
                    qdpVar.i.m(qdpVar.g, qdpVar.c);
                    qdpVar.e = j$.util.Optional.empty();
                }
                set2.add(this.a);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.qdp qdpVar2 = (defpackage.qdp) this.b;
                java.util.Set set3 = qdpVar2.f;
                set3.remove(this.a);
                if (set3.isEmpty()) {
                    defpackage.qdp.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/DisplayStateTracker", "unregisterCall", 138, "DisplayStateTracker.java").v("unregistering displayListener");
                    qdpVar2.i.n(qdpVar2.g);
                    qdpVar2.e = j$.util.Optional.empty();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ahzf ahzfVar = defpackage.qeq.a;
                ?? r2 = this.a;
                java.util.Iterator it = ahzfVar.h((java.lang.CharSequence) r2).iterator();
                while (true) {
                    java.lang.Object obj9 = this.b;
                    boolean zHasNext = it.hasNext();
                    defpackage.qfg qfgVar = (defpackage.qfg) obj9;
                    defpackage.qeq qeqVar = qfgVar.f;
                    java.util.List list = qfgVar.b;
                    if (!zHasNext) {
                        if (((java.lang.String) r2).endsWith("\r\n")) {
                            int iB = defpackage.qeq.b(list);
                            if (!((java.lang.Boolean) qeqVar.b.a()).booleanValue() || iB >= 0) {
                                ((defpackage.qep) list.get(iB)).c();
                            }
                        }
                        qfgVar.g = j$.util.Optional.of(java.lang.Integer.valueOf(defpackage.qeq.b(list)));
                        return;
                    }
                    java.lang.String str3 = (java.lang.String) it.next();
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            qepVarC = defpackage.qeq.c();
                            qepVarC.b(str3);
                            qepVarC.e();
                            if (it.hasNext()) {
                                qepVarC.c();
                            }
                            if (!qepVarC.a().isEmpty()) {
                                list.add(qepVarC);
                            }
                        } else if (((defpackage.qep) list.get(size)).a && !((defpackage.qep) list.get(size)).c) {
                            qepVarC = (defpackage.qep) list.get(size);
                            qepVarC.b(str3);
                            if (it.hasNext()) {
                                qepVarC.c();
                            }
                            if (qepVarC.a().isEmpty()) {
                                list.remove(size);
                            }
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(qepVarC.a());
                    while (sb.length() > 0 && sb.charAt(0) == '\b') {
                        list.remove(qepVarC);
                        sb.delete(0, 1);
                        int iB2 = defpackage.qeq.b(list);
                        if (iB2 < 0) {
                            while (sb.length() > 0 && sb.charAt(0) == '\b') {
                                sb.deleteCharAt(0);
                            }
                            if (sb.length() <= 0) {
                            }
                            defpackage.qep qepVarC2 = defpackage.qeq.c();
                            qepVarC2.b(sb.toString());
                            qepVarC2.e();
                            if (it.hasNext()) {
                                qepVarC2.c();
                            }
                            list.add(qepVarC2);
                        }
                        qepVarC = (defpackage.qep) list.get(iB2);
                        qepVarC.d();
                        qepVarC.b(sb.toString());
                        if (((java.lang.Boolean) qeqVar.b.a()).booleanValue() && qepVarC.a().isEmpty()) {
                            list.remove(iB2);
                        }
                        sb = new java.lang.StringBuilder(qepVarC.a());
                        break;
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.qfg qfgVar2 = (defpackage.qfg) this.b;
                java.util.List list2 = qfgVar2.b;
                java.lang.Object obj10 = this.a;
                int iA = defpackage.qeq.a(list2);
                if (iA >= 0) {
                    defpackage.qep qepVar = (defpackage.qep) list2.get(iA);
                    if (!qepVar.c) {
                        qepVar.b((java.lang.String) obj10);
                        qfgVar2.g = j$.util.Optional.of(java.lang.Integer.valueOf(iA));
                        if (android.text.TextUtils.isEmpty(qepVar.a())) {
                            list2.remove(iA);
                            return;
                        }
                        return;
                    }
                }
                defpackage.qep qepVarC3 = defpackage.qeq.c();
                qepVarC3.b((java.lang.String) obj10);
                list2.add(qepVarC3);
                qfgVar2.g = j$.util.Optional.of(java.lang.Integer.valueOf(list2.size() - 1));
                return;
            case 15:
                ((android.view.View) this.b).setVisibility(0);
                java.lang.Object obj11 = this.a;
                defpackage.qtd qtdVar = (defpackage.qtd) obj11;
                if (((aw) qtdVar.d).Q != null) {
                    j$.util.Optional optionalJ = qtdVar.j();
                    if (true == optionalJ.isPresent()) {
                        ((android.view.View) optionalJ.get()).setVisibility(0);
                    }
                    qtdVar.f().setVisibility(0);
                    j$.util.Optional optional = qtdVar.l;
                    defpackage.qmp qmpVar = new defpackage.qmp(obj11, 19);
                    if (true == optional.isPresent()) {
                        ((defpackage.qtd) qmpVar.a).x(((defpackage.qqr) optional.get()).h.a);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((android.widget.TextView) this.b).setVisibility(8);
                ((defpackage.qtd) this.a).n = j$.util.Optional.empty();
                return;
            case 17:
                ((android.view.View) this.b).setVisibility(4);
                java.lang.Object obj12 = this.a;
                defpackage.qtd qtdVar2 = (defpackage.qtd) obj12;
                if (((aw) qtdVar2.d).Q != null) {
                    j$.util.Optional optionalJ2 = qtdVar2.j();
                    if (true == optionalJ2.isPresent()) {
                        ((android.view.View) optionalJ2.get()).setVisibility(4);
                    }
                    qtdVar2.f().setVisibility(4);
                    j$.util.Optional optional2 = qtdVar2.l;
                    defpackage.qst qstVar = new defpackage.qst(obj12, i3);
                    if (true == optional2.isPresent()) {
                        ((defpackage.qtd) qstVar.a).x(((defpackage.qqr) optional2.get()).h.a);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                defpackage.qyr qyrVar = (defpackage.qyr) this.b;
                java.lang.String str4 = qyrVar.c;
                aooh.e(str4, "getCallId(...)");
                defpackage.qym qymVarA = ((defpackage.qyv) this.a).a(str4);
                if (qymVarA != null) {
                    alat alatVar = qyrVar.b;
                    aooh.e(alatVar, "getCategoryButtonsList(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
                    java.util.Iterator it2 = alatVar.iterator();
                    while (it2.hasNext()) {
                        defpackage.qxp qxpVar = ((defpackage.qyl) it2.next()).c;
                        if (qxpVar == null) {
                            qxpVar = defpackage.qxp.a;
                        }
                        defpackage.que queVarB = defpackage.que.b(qxpVar.c);
                        if (queVarB == null) {
                            queVarB = defpackage.que.UNKNOWN;
                        }
                        arrayList.add(queVarB);
                    }
                    if (!qymVarA.e && arrayList.contains(defpackage.que.CALL_ASSIST)) {
                        qymVarA.e = true;
                        qymVarA.j.bm(rmu.N);
                    }
                    if (qymVarA.d || arrayList.isEmpty()) {
                        return;
                    }
                    qymVarA.d = true;
                    qymVarA.i.i(aoov.am(qymVarA.b, 0, new defpackage.pbw(qymVarA, (aoln) null, 11), 3));
                    return;
                }
                return;
            case 19:
                akzx akzxVarM2 = defpackage.rce.a.m();
                defpackage.rcd rcdVar = defpackage.rcd.MULTIBINDING_PROVIDED_FRAGMENT;
                akzxVarM2.u();
                defpackage.rce rceVar = (defpackage.rce) akzxVarM2.b;
                rceVar.c = rcdVar.e;
                rceVar.b |= 1;
                akzxVarM2.u();
                defpackage.rce rceVar2 = (defpackage.rce) akzxVarM2.b;
                rceVar2.d = ((defpackage.qtr) this.b).k;
                rceVar2.b |= 2;
                defpackage.rce rceVar3 = (defpackage.rce) akzxVarM2.p();
                defpackage.rap rapVar = (defpackage.rap) this.a;
                if (rapVar.l.equals(rceVar3)) {
                    defpackage.rce rceVar4 = defpackage.rcf.a;
                    rapVar.l = defpackage.rcf.a;
                } else {
                    rapVar.l = rceVar3;
                }
                rapVar.p.a(ajcm.a);
                return;
            default:
                aimw aimwVarL = defpackage.rap.a.b().l("com/android/dialer/incall/voice/service/VoiceController", "displayMultibindingProvidedBottomSheetFragment", 392, "VoiceController.java");
                java.lang.Object obj13 = this.b;
                aimwVarL.y("bottomSheetFragmentKey: %s", obj13);
                akzx akzxVarM3 = defpackage.rce.a.m();
                defpackage.rcd rcdVar2 = defpackage.rcd.MULTIBINDING_PROVIDED_FRAGMENT;
                akzxVarM3.u();
                defpackage.rce rceVar5 = (defpackage.rce) akzxVarM3.b;
                rceVar5.c = rcdVar2.e;
                rceVar5.b |= 1;
                akzxVarM3.u();
                defpackage.rce rceVar6 = (defpackage.rce) akzxVarM3.b;
                rceVar6.d = ((defpackage.qtr) obj13).k;
                rceVar6.b |= 2;
                defpackage.rce rceVar7 = (defpackage.rce) akzxVarM3.p();
                defpackage.rap rapVar2 = (defpackage.rap) this.a;
                rapVar2.l = rceVar7;
                rapVar2.p.a(ajcm.a);
                return;
        }
    }

    public /* synthetic */ pmw(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
