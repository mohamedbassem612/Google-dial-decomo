package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mo implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public mo(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, android.view.View view, int i, int i2) {
        this.$cid = i2;
        this.c = view;
        this.a = i;
        j$.util.Objects.requireNonNull(bottomSheetBehavior);
        this.b = bottomSheetBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, zne] */
    /* JADX WARN: Type inference failed for: r1v18, types: [fct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oi] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [etl, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ajdd ajddVar;
        int i;
        switch (this.$cid) {
            case 0:
                int i2 = this.a;
                on onVar = (on) this.c;
                java.lang.String str = (java.lang.String) onVar.a.get(java.lang.Integer.valueOf(i2));
                if (str != null) {
                    nf nfVar = (nf) onVar.d.get(str);
                    java.lang.Object obj = nfVar != null ? nfVar.a : null;
                    java.lang.Object obj2 = ((defpackage.oq) this.b).a;
                    if (obj == null) {
                        onVar.f.remove(str);
                        onVar.e.put(str, obj2);
                        return;
                    }
                    ?? r1 = nfVar.a;
                    aooh.d((java.lang.Object) r1, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                    if (onVar.c.remove(str)) {
                        r1.a(obj2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ii.b((android.widget.TextView) this.b, (android.graphics.Typeface) this.c, this.a);
                return;
            case 2:
                ((on) this.b).e(this.a, 0, new android.content.Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (java.io.Serializable) this.c));
                return;
            case 3:
                for (defpackage.etn etnVar : (java.util.concurrent.CopyOnWriteArraySet) this.b) {
                    if (!etnVar.c) {
                        int i3 = this.a;
                        if (i3 != -1) {
                            etnVar.d.h(i3);
                        }
                        ?? r3 = this.c;
                        etnVar.b = true;
                        r3.a(etnVar.a);
                    }
                }
                return;
            case 4:
                android.util.Pair pair = (android.util.Pair) this.c;
                ((defpackage.eyw) this.b).a.i.K(((java.lang.Integer) pair.first).intValue(), (defpackage.ffu) pair.second, this.a);
                return;
            case 5:
                this.b.K(0, (defpackage.ffu) ((alic) this.c).b, this.a);
                return;
            case 6:
                defpackage.kma kmaVar = (defpackage.kma) this.c;
                kmaVar.K();
                kmaVar.C().setVisibility(8);
                ((defpackage.kla) this.b).h = java.lang.Integer.valueOf(this.a);
                return;
            case 7:
                ((defpackage.kma) this.c).K();
                ((defpackage.kla) this.b).i = java.lang.Integer.valueOf(this.a);
                return;
            case 8:
                int i4 = pti.b;
                this.b.b((android.telecom.Call) this.c, this.a);
                return;
            case 9:
                int i5 = this.a;
                java.lang.Object obj3 = this.c;
                rwi rwiVar = (rwi) this.b;
                rwiVar.d.notify(i5, (android.app.Notification) obj3);
                zjv.i(rwiVar.f, mgv.cC, aify.q(mhc.a, gus.au(i5)), (mhc) null, 0, 28);
                return;
            case 10:
                int i6 = this.a != 1 ? 0 : 1;
                ynf ynfVar = (ynf) this.b;
                ynfVar.b.c(ynfVar.a, i6, (ymi) this.c);
                return;
            case 11:
                android.text.Layout layout = ((android.widget.TextView) ((da) this.b).findViewById(2131428456)).getLayout();
                if (layout != null) {
                    ((android.widget.ScrollView) this.c).scrollTo(0, layout.getLineTop(layout.getLineForOffset(this.a)));
                    return;
                }
                return;
            case 12:
                int i7 = this.a;
                ?? r2 = this.b;
                ((aflq) this.c).a.a(new aogw(3, ((amhm) r2.get(i7)).e, ((amhm) r2.get(i7)).d));
                long j = afjz.a;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b).w((android.view.View) this.c, this.a, false);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((agfo) this.b).b(this.a, (android.os.Bundle) this.c);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                agsn agsnVar = ((agsm) this.c).b;
                agsnVar.e.remove(this.b);
                while (true) {
                    int i8 = this.a;
                    java.util.concurrent.atomic.AtomicLong atomicLong = agsnVar.c;
                    long j2 = atomicLong.get();
                    int iA = agsn.a(j2);
                    int iB = agsn.b(j2);
                    if (iB != i8) {
                        synchronized (agsnVar.d) {
                            agsnVar.g.remove(i8);
                            break;
                        }
                        return;
                    }
                    if (iA == 1) {
                        if (atomicLong.compareAndSet(j2, iB)) {
                            synchronized (agsnVar.d) {
                                android.util.SparseArray sparseArray = agsnVar.g;
                                ajddVar = (ajdd) sparseArray.get(iB);
                                if (ajddVar == null) {
                                    android.util.SparseArray sparseArray2 = agsnVar.f;
                                    ajddVar = (ajdd) sparseArray2.get(iB);
                                    ahvr.ci(ajddVar);
                                    sparseArray2.put(iB, agsn.b);
                                } else {
                                    sparseArray.remove(iB);
                                }
                                break;
                            }
                            ajddVar.o((java.lang.Object) null);
                            return;
                        }
                    } else {
                        if (iA <= 0) {
                            throw new java.lang.IllegalStateException(a.bj(iA, "Can't decrement at zero or less refcount: "));
                        }
                        if (atomicLong.compareAndSet(j2, agsn.c(iA - 1, j2))) {
                            return;
                        }
                    }
                }
                break;
            case 16:
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = ((agsu) obj4).b;
                int i9 = this.a;
                java.lang.Object obj6 = this.b;
                synchronized (obj5) {
                    java.util.IdentityHashMap identityHashMap = ((agsu) obj4).c;
                    agsr agsrVar = (agsr) identityHashMap.remove(obj6);
                    ((agsu) obj4).d.g(obj6);
                    if (((agsu) obj4).j.ordinal() == 2 && agsrVar == ((agsu) obj4).m) {
                        if (identityHashMap.isEmpty()) {
                            ((agsu) obj4).d();
                        } else {
                            ((agsu) obj4).i.remove(java.lang.Integer.valueOf(i9));
                            ((agsu) obj4).e((agsr) null);
                        }
                    }
                    break;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.ajcf ajcfVar = (defpackage.ajcf) this.b;
                ajcq[] ajcqVarArr = ajcfVar.d;
                int i10 = this.a;
                ajcq ajcqVar = (ajcq) j$.util.Objects.requireNonNull(ajcqVarArr[i10]);
                ajcqVarArr[i10] = null;
                int i11 = ajcfVar.e;
                while (true) {
                    java.lang.Object obj7 = this.c;
                    i = ((aike) obj7).d;
                    if (i11 < i) {
                        i = i11 + 1;
                        if (((ajac) ((aify) obj7).get(i11)).q(ajcqVar)) {
                            ajcfVar.a();
                        } else {
                            i11 = i;
                        }
                    }
                }
                ajcfVar.e = i;
                return;
            default:
                try {
                    if (((antg) this.b).b(this.a, (android.os.Parcel) this.c)) {
                        return;
                    }
                    ante.a.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
                    return;
                } catch (java.lang.Exception e) {
                    ante.a.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (java.lang.Throwable) e);
                    return;
                }
        }
    }

    public /* synthetic */ mo(java.lang.Object obj, int i, java.lang.Object obj2, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public /* synthetic */ mo(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public /* synthetic */ mo(java.lang.Object obj, java.lang.Object obj2, int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }

    public /* synthetic */ mo(on onVar, int i, defpackage.oq oqVar, int i2) {
        this.$cid = i2;
        this.c = onVar;
        this.a = i;
        this.b = oqVar;
    }

    public mo(android.widget.TextView textView, android.graphics.Typeface typeface, int i, int i2) {
        this.$cid = i2;
        this.b = textView;
        this.c = typeface;
        this.a = i;
    }
}
