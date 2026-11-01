package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class qat implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qat(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v27, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v18, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v58, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        defpackage.ajcq ajcqVarH;
        switch (this.$cid) {
            case 0:
                jxb jxbVarA = jxa.a(((android.content.Intent) this.b).getBundleExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS"));
                if (jxbVarA == null || (jxbVarA.c & 8388608) == 0) {
                    return defpackage.ajcm.a;
                }
                return ((qau) this.a).a.i(jxbVarA.y, jxn.c);
            case 1:
                puq puqVar = (puq) this.a;
                defpackage.zpm zpmVar = puqVar.b;
                java.lang.String strD = puqVar.t.d((android.telecom.Call) this.b);
                zpmVar.j(strD);
                puqVar.r.remove(strD);
                return defpackage.ajcm.a;
            case 2:
                jxb jxbVarA2 = jxa.a(((android.telecom.Call) this.b).getDetails().getIntentExtras());
                if (jxbVarA2 == null || (jxbVarA2.c & 8388608) == 0) {
                    return defpackage.ajcm.a;
                }
                return ((defpackage.gat) ((pzm) this.a).c).i(jxbVarA2.y, jxn.d);
            case 3:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                qbl qblVar = (qbl) this.b;
                defpackage.ailj it = qblVar.h.e().iterator();
                while (it.hasNext()) {
                    java.lang.Object obj = this.a;
                    qbb qbbVar = (qbb) it.next();
                    arrayList.add(defpackage.ahvr.H(qbbVar.a(), new oqe(qbbVar, obj, 10), qblVar.c));
                }
                return defpackage.ahvr.aj(arrayList).o(new onq(5), defpackage.ajbm.INSTANCE);
            case 4:
                java.lang.Object obj2 = this.b;
                qfd qfdVar = (qfd) obj2;
                return defpackage.ahrv.g(defpackage.ahrv.g(qfdVar.d.c()).i(new phd(obj2, this.a, 5), qfdVar.c));
            case 5:
                return defpackage.ahvr.H(this.a.d(), new pqn(12), this.b);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.ahvr.H(this.a.d(), new pqn(13), this.b);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ahvr.H(this.a.d(), new pqn(14), this.b);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.aosv.F(this.a, 0, new roy((aeok) this.b, (defpackage.aoln) null, 20), 3);
            case 9:
                return defpackage.aosv.F(this.a, 0, new sfo((android.content.Context) this.b, (defpackage.aoln) null, 8), 3);
            case 10:
                java.lang.Object obj3 = this.a;
                defpackage.swt swtVar = (defpackage.swt) this.b;
                defpackage.ajbg ajbgVarD = swtVar.m.d(android.net.Uri.withAppendedPath(android.provider.CallLog.Calls.CONTENT_FILTER_URI, android.net.Uri.encode((java.lang.String) obj3)), new java.lang.String[]{"_id"}, null, null, null);
                defpackage.ajbc ajbcVarE = defpackage.ahqx.e(new defpackage.kwb(7));
                defpackage.ajct ajctVar = swtVar.f;
                return ajbgVarD.c(ajbcVarE, ajctVar).h().u(defpackage.aguh.class, new rht(15), ajctVar).u(java.lang.RuntimeException.class, new rht(16), ajctVar);
            case 11:
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) szs.a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "setRevelioOutcome", 677, "RevelioController.java");
                java.lang.Object obj4 = this.a;
                aimwVar.y("set outcome to: %s", obj4);
                szs szsVar = (szs) this.b;
                szsVar.A = true;
                return szsVar.i.c(szsVar.k, (amrc) obj4);
            case 12:
                java.lang.Object obj5 = this.a;
                szt sztVar = (szt) obj5;
                if (sztVar.f) {
                    ((defpackage.aimw) ((defpackage.aimw) szt.a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioConversationListener", "onConversationChanged", 76, "RevelioConversationListener.java")).v("conversation has already been marked as completed");
                    return defpackage.ajcm.a;
                }
                return defpackage.ahvr.I(sztVar.b.b(), new tak(obj5, this.b, 1), sztVar.e);
            case 13:
                return defpackage.ahvr.H(this.a.d(), new syf(11), this.b);
            case 14:
                tia tiaVar = (tia) this.b;
                android.content.Context context = tiaVar.b;
                java.lang.String str = (java.lang.String) this.a;
                tiaVar.i.c = defpackage.vwb.j(context, str);
                defpackage.aify aifyVarB = defpackage.mfk.a(context).b(str);
                return defpackage.ahvr.H(tiaVar.d.a((java.util.List) j$.util.Collection.-EL.stream(aifyVarB).map(new thw(0)).collect(j$.util.stream.Collectors.toCollection(new rqc(4)))), new lda(tiaVar, aifyVarB, str, new defpackage.aift(4), 4), tiaVar.c);
            case 15:
                final ?? r1 = this.a;
                final defpackage.tvd tvdVar = (defpackage.tvd) ((defpackage.rsr) this.b).b;
                return tvdVar.c.submit(defpackage.ahqx.i(new java.util.concurrent.Callable() { // from class: tvc
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        defpackage.aimz aimzVar = defpackage.tvd.a;
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/shortcuts/DynamicShortcuts", "refreshInBackground", 113, "DynamicShortcuts.java")).v("refreshInBackground");
                        defpackage.tvd tvdVar2 = tvdVar;
                        android.content.Context context2 = tvdVar2.b;
                        android.content.pm.ShortcutManager shortcutManagerA = defpackage.tvd.a(context2);
                        if (defpackage.dvx.c(context2, "android.permission.READ_CONTACTS") != 0) {
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).i(defpackage.zct.b)).l("com/android/dialer/shortcuts/DynamicShortcuts", "refreshInBackground", 'w', "DynamicShortcuts.java")).v("no contact permissions");
                            hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerA);
                            return null;
                        }
                        java.util.List<tvk> list = r1;
                        int iMin = java.lang.Math.min(3, hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerA) - hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerA).size());
                        defpackage.aca acaVar = new defpackage.aca(iMin);
                        int i = 0;
                        for (tvk tvkVar : list) {
                            if (acaVar.d >= iMin) {
                                break;
                            }
                            java.lang.String strC = tvdVar2.d.c(tvkVar.c, null);
                            long j = tvkVar.a;
                            tva tvaVarC = tvb.c();
                            tvaVarC.b(j);
                            tvaVarC.d(tvkVar.b);
                            tvaVarC.c(strC);
                            int i2 = i + 1;
                            tvaVarC.e(i);
                            tvb tvbVarA = tvaVarC.a();
                            acaVar.put(tvbVarA.b, tvbVarA);
                            i = i2;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(hq$.ExternalSyntheticApiModelOutline1.m$1(shortcutManagerA));
                        defpackage.ucm ucmVar = new defpackage.ucm();
                        if (!arrayList2.isEmpty()) {
                            java.util.Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                android.content.pm.ShortcutInfo shortcutInfoM = hq$.ExternalSyntheticApiModelOutline1.m(it2.next());
                                tvb tvbVar = (tvb) acaVar.get(hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM));
                                if (tvbVar == null) {
                                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/shortcuts/DynamicShortcuts", "computeDelta", 210, "DynamicShortcuts.java")).v("contact removed");
                                    ucmVar.c.add(hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM));
                                } else if (tvbVar.d(shortcutInfoM)) {
                                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/shortcuts/DynamicShortcuts", "computeDelta", 205, "DynamicShortcuts.java")).v("contact updated");
                                    ucmVar.b.put(hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM), tvbVar);
                                }
                            }
                            for (java.util.Map.Entry entry : acaVar.entrySet()) {
                                java.lang.String str2 = (java.lang.String) entry.getKey();
                                tvb tvbVar2 = (tvb) entry.getValue();
                                java.util.Iterator it3 = arrayList2.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/shortcuts/DynamicShortcuts", "computeDelta", 221, "DynamicShortcuts.java")).v("contact added");
                                        ucmVar.a.put(str2, tvbVar2);
                                        break;
                                    }
                                } while (!hq$.ExternalSyntheticApiModelOutline1.m(hq$.ExternalSyntheticApiModelOutline1.m(it3.next())).equals(str2));
                            }
                        } else {
                            ucmVar.a.putAll(acaVar);
                        }
                        android.content.pm.ShortcutManager shortcutManagerA2 = defpackage.tvd.a(context2);
                        ?? r0 = ucmVar.c;
                        if (!r0.isEmpty()) {
                            hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerA2, (java.util.List) r0);
                        }
                        ?? r2 = ucmVar.b;
                        if (!r2.isEmpty()) {
                            hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerA2, tvdVar2.e.l(r2));
                        }
                        ?? r3 = ucmVar.a;
                        if (!r3.isEmpty()) {
                            hq$.ExternalSyntheticApiModelOutline1.m$1(shortcutManagerA2, tvdVar2.e.l(r3));
                        }
                        return null;
                    }
                }));
            case 16:
                return ((tzv) this.b).d(defpackage.aify.p(this.a));
            case 17:
                ?? r2 = this.a;
                if (r2.isEmpty()) {
                    return defpackage.ajcm.a;
                }
                defpackage.adag adagVar = new defpackage.adag((byte[]) null);
                adagVar.n("INSERT OR REPLACE INTO timekeeper_info (phone_number, details) VALUES");
                for (int i = 0; i < r2.size() - 1; i++) {
                    adagVar.n(" (?, ?),");
                }
                java.lang.Object obj6 = this.b;
                adagVar.n(" (?, ?)");
                return ((usj) obj6).b.a.F(new ufj(adagVar.B(), (java.lang.Object) r2, 3));
            case 18:
                defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
                adagVar2.n("INSERT OR REPLACE INTO timekeeper_call_history (call_creation_time_millis, call_history) VALUES (?, ?)");
                return ((usj) this.a).b.a.F(new ufj(adagVar2.B(), (defpackage.alad) this.b, 4));
            case 19:
                defpackage.adag adagVar3 = new defpackage.adag((byte[]) null);
                adagVar3.n("SELECT details FROM timekeeper_info WHERE phone_number = ?");
                adagVar3.p((java.lang.String) this.a);
                return ((usj) this.b).b.a.F(new jsh(adagVar3.B(), 13));
            default:
                zlr zlrVar = (zlr) this.a.a();
                java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) zlrVar.c;
                if (atomicReference.get() != null) {
                    ajcqVarH = defpackage.aiql.z((j$.util.Optional) atomicReference.get());
                } else {
                    defpackage.ahrv ahrvVarG = defpackage.ahrv.g(((utg) defpackage.aooc.ar(((afpl) zlrVar.a).Y(), utg.class)).bl());
                    udu uduVar = new udu(zlrVar, 14);
                    ?? r5 = zlrVar.b;
                    ajcqVarH = defpackage.ahvr.H(ahrvVarG.i(uduVar, r5), new uev(zlrVar, 14), r5);
                }
                return defpackage.ahvr.H(ajcqVarH, new uqm(16), this.b);
        }
    }

    public /* synthetic */ qat(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
