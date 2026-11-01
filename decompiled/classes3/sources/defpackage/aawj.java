package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawj implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public aawj(defpackage.aawk aawkVar, com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        this.$cid = i;
        this.a = dataHolder;
        j$.util.Objects.requireNonNull(aawkVar);
        this.b = aawkVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x014b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0161 A[LOOP:0: B:49:0x015b->B:51:0x0161, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [absl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [absl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v29, types: [absl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v39, types: [adrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v40, types: [adrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v41, types: [adrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v67, types: [aehm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v74, types: [aejv, java.lang.Object] */
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
    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        defpackage.aejm aejmVar;
        ahwt ahwtVar;
        defpackage.aeim aeimVar;
        defpackage.aehz aehzVar;
        java.util.Iterator it;
        android.animation.Animator animator;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        switch (this.$cid) {
            case 0:
                defpackage.aawa aawaVar = new defpackage.aawa((com.google.android.gms.common.data.DataHolder) this.a, 1, null);
                try {
                    ((defpackage.aawk) this.b).a("onDataChanged");
                    return;
                } finally {
                    aawaVar.a();
                }
            case 1:
                java.lang.Object obj5 = this.b;
                defpackage.aawa aawaVar2 = new defpackage.aawa(((com.google.android.gms.wearable.internal.NodeMigratedEventParcelable) obj5).b, 0);
                try {
                    if (((defpackage.aawk) this.a).a("onNodeMigrated") != null) {
                        java.lang.String str = ((com.google.android.gms.wearable.internal.NodeMigratedEventParcelable) obj5).a;
                        break;
                    }
                    aawaVar2.a();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        aawaVar2.a();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 2:
                defpackage.aawl aawlVarA = ((defpackage.aawk) this.a).a("onMessageReceived");
                if (aawlVarA != null) {
                    aawlVarA.d((com.google.android.gms.wearable.internal.MessageEventParcelable) this.b);
                    return;
                }
                return;
            case 3:
                defpackage.aawl aawlVarA2 = ((defpackage.aawk) this.a).a("onChannelEvent");
                if (aawlVarA2 != null) {
                    com.google.android.gms.wearable.internal.ChannelEventParcelable channelEventParcelable = (com.google.android.gms.wearable.internal.ChannelEventParcelable) this.b;
                    channelEventParcelable.a(aawlVarA2);
                    channelEventParcelable.a(aawlVarA2.i);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.abre abreVar = (defpackage.abre) this.a;
                defpackage.abrf abrfVar = abreVar.b;
                java.lang.Object obj6 = this.b;
                java.lang.String string = abrfVar.d ? abreVar.a.toString() : abreVar.a.getClass().toString();
                java.lang.Thread thread = (java.lang.Thread) obj6;
                java.lang.RuntimeException runtimeExceptionB = ahrc.b(thread);
                defpackage.abqt abqtVarA = defpackage.abqt.a(thread, runtimeExceptionB.getStackTrace().length > 0 ? runtimeExceptionB : null);
                java.lang.String message = abqtVarA.getMessage();
                abrn abrnVar = abrfVar.c;
                abrnVar.f();
                defpackage.abrl abrlVar = new defpackage.abrl("On " + message + " task took longer than 1 " + java.lang.String.valueOf(abrnVar.g()) + " so assumed deadlocked: " + string, abqtVarA.getStackTrace(), abqtVarA.getCause());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Set set = abrfVar.a;
                synchronized (set) {
                    arrayList = new java.util.ArrayList(set);
                    break;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.addAll(((defpackage.abrh) arrayList.get(i)).a());
                }
                abrlVar.addSuppressed(abqtVarA);
                arrayList2.remove(obj6);
                abri.a(abreVar.b.b, arrayList2, abrlVar);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ?? r0 = this.b;
                java.lang.Object obj7 = this.a;
                try {
                    r0.run();
                    java.util.HashSet hashSet = ((defpackage.abrh) obj7).a;
                    synchronized (hashSet) {
                        hashSet.remove(java.lang.Thread.currentThread());
                        break;
                    }
                    return;
                } catch (java.lang.Throwable th3) {
                    java.util.HashSet hashSet2 = ((defpackage.abrh) obj7).a;
                    synchronized (hashSet2) {
                        hashSet2.remove(java.lang.Thread.currentThread());
                        throw th3;
                    }
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj8 = this.a;
                java.lang.Object obj9 = this.b;
                synchronized (((abrr) obj9).a) {
                    ((abrr) obj9).a((defpackage.aliq) obj8);
                    break;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                long id = java.lang.Thread.currentThread().getId();
                defpackage.absn absnVar = (defpackage.absn) this.a;
                absnVar.a.d(id);
                try {
                    this.b.run();
                    return;
                } finally {
                    absnVar.a.c(id);
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.adnk) this.a).b.c((java.util.List) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((defpackage.adnk) this.a).b.b((adof) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                lpb.b();
                hze hzeVar = (hze) ((adoz) this.a).a.a;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = hzeVar.f;
                akzc akzcVarU = akzc.u((byte[]) this.b);
                if (!atomicBoolean.get()) {
                    a.bI(hze.a.c().m(aioa.b), "write called when not activated", "com/android/dialer/audio/impl/ExternalAudioSource", "write", 'd', "ExternalAudioSource.java", zct.b);
                    return;
                }
                lpb lpbVar = hzeVar.d;
                lpb.b();
                ailj ailjVarK = hzeVar.c.c().k();
                while (ailjVarK.hasNext()) {
                    ((hyw) ailjVarK.next()).d(akzcVarU);
                }
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                this.b.m((defpackage.adro) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                this.b.n((defpackage.adrr) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                this.b.o((defpackage.adrr) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((ajbw) this.a).execute((java.lang.Runnable) this.b);
                return;
            case 15:
                ((ajbw) this.a).execute((java.lang.Runnable) this.b);
                return;
            case 16:
                java.lang.Object obj10 = this.a;
                com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc = (com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc) obj10;
                ahvr.bZ(accountParticleDisc.c(), "initialize must be called first");
                java.lang.Object obj11 = accountParticleDisc.j;
                java.lang.Object obj12 = this.b;
                i = obj12 == null ? 1 : 0;
                if (obj12 != null) {
                    if (obj11 == null) {
                        obj = obj12;
                    } else if (!accountParticleDisc.k.b(obj12).equals(accountParticleDisc.k.b(obj11))) {
                        accountParticleDisc.a();
                    }
                    accountParticleDisc.j = obj12;
                    defpackage.aehs aehsVar = accountParticleDisc.a;
                    afec.c();
                    aehsVar.g(i ^ 1);
                    aehsVar.i(new defpackage.acxq(obj10, obj12, aehsVar, 3, (byte[]) null));
                    aejmVar = accountParticleDisc.n;
                    afec.c();
                    java.lang.Object obj13 = aejmVar.b;
                    aejmVar.d(null, aejmVar.c);
                    aejmVar.d((defpackage.aelu) aejmVar.a, aejmVar.c);
                    aejmVar.c = obj12;
                    java.lang.Object obj14 = aejmVar.b;
                    aejmVar.c(null, obj12);
                    aejmVar.c((defpackage.aelu) aejmVar.a, obj12);
                    afec.c();
                    if (accountParticleDisc.i) {
                        afec.c();
                        obj2 = aejmVar.c;
                        if (obj2 == null) {
                            ahwtVar = ahwt.a;
                        } else {
                            java.lang.Object obj15 = aejmVar.b;
                            obj3 = aejmVar.a;
                            if (obj3 != null || (obj4 = ((defpackage.aelu) obj3).b(obj2).b) == null) {
                                ahwtVar = ahwt.a;
                            } else {
                                ahwtVar = ((defpackage.aehv) obj4).a;
                            }
                        }
                    } else {
                        ahwtVar = ahwt.a;
                    }
                    accountParticleDisc.l = ahwtVar;
                    aeimVar = accountParticleDisc.f;
                    if (aeimVar != null) {
                        aeimVar.a(accountParticleDisc.l);
                    }
                    aehzVar = accountParticleDisc.e;
                    if (aehzVar != null) {
                        afec.c();
                        if (!j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(aehzVar.b, "badgeScale", 0.0f, 1.0f);
                            objectAnimatorOfFloat.addListener(new defpackage.aehy(aehzVar, null));
                            objectAnimatorOfFloat.setDuration(0L);
                            objectAnimatorOfFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
                            objectAnimatorOfFloat.addListener(new defpackage.aehx(aehzVar));
                            animator = aehzVar.d;
                            if (animator != null) {
                                animator.end();
                            }
                            aehzVar.d = objectAnimatorOfFloat;
                            aehzVar.d.start();
                        }
                    }
                    it = accountParticleDisc.d.iterator();
                    while (it.hasNext()) {
                        ((defpackage.aeht) it.next()).a();
                    }
                    return;
                }
                obj = null;
                if (obj != obj11) {
                    accountParticleDisc.a();
                }
                accountParticleDisc.j = obj12;
                defpackage.aehs aehsVar2 = accountParticleDisc.a;
                afec.c();
                aehsVar2.g(i ^ 1);
                aehsVar2.i(new defpackage.acxq(obj10, obj12, aehsVar2, 3, (byte[]) null));
                aejmVar = accountParticleDisc.n;
                afec.c();
                java.lang.Object obj16 = aejmVar.b;
                aejmVar.d(null, aejmVar.c);
                aejmVar.d((defpackage.aelu) aejmVar.a, aejmVar.c);
                aejmVar.c = obj12;
                java.lang.Object obj17 = aejmVar.b;
                aejmVar.c(null, obj12);
                aejmVar.c((defpackage.aelu) aejmVar.a, obj12);
                afec.c();
                if (accountParticleDisc.i) {
                    afec.c();
                    obj2 = aejmVar.c;
                    if (obj2 == null) {
                        ahwtVar = ahwt.a;
                    } else {
                        java.lang.Object obj18 = aejmVar.b;
                        obj3 = aejmVar.a;
                        if (obj3 != null) {
                            ahwtVar = ahwt.a;
                        } else {
                            ahwtVar = ahwt.a;
                        }
                    }
                } else {
                    ahwtVar = ahwt.a;
                }
                accountParticleDisc.l = ahwtVar;
                aeimVar = accountParticleDisc.f;
                if (aeimVar != null) {
                    aeimVar.a(accountParticleDisc.l);
                }
                aehzVar = accountParticleDisc.e;
                if (aehzVar != null) {
                    afec.c();
                    if (!j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(aehzVar.b, "badgeScale", 0.0f, 1.0f);
                        objectAnimatorOfFloat2.addListener(new defpackage.aehy(aehzVar, null));
                        objectAnimatorOfFloat2.setDuration(0L);
                        objectAnimatorOfFloat2.setInterpolator(new android.view.animation.AccelerateInterpolator());
                        objectAnimatorOfFloat2.addListener(new defpackage.aehx(aehzVar));
                        animator = aehzVar.d;
                        if (animator != null) {
                            animator.end();
                        }
                        aehzVar.d = objectAnimatorOfFloat2;
                        aehzVar.d.start();
                    }
                }
                it = accountParticleDisc.d.iterator();
                while (it.hasNext()) {
                    ((defpackage.aeht) it.next()).a();
                }
                return;
            case 17:
                afec.c();
                com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc2 = (com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc) this.b;
                defpackage.aejm aejmVar2 = accountParticleDisc2.n;
                if (aejmVar2.a == null) {
                    ?? r10 = this.a;
                    accountParticleDisc2.p = new defpackage.vqf(accountParticleDisc2.getResources(), accountParticleDisc2.m);
                    defpackage.aelu aeluVar = new defpackage.aelu(accountParticleDisc2.p, (defpackage.aehm) r10);
                    afec.c();
                    aejmVar2.d((defpackage.aelu) aejmVar2.a, aejmVar2.c);
                    aejmVar2.a = aeluVar;
                    aejmVar2.c(aeluVar, aejmVar2.c);
                    return;
                }
                return;
            case 18:
                defpackage.aejd aejdVar = ((defpackage.aejb) this.a).a;
                aejdVar.g = (aify) this.b;
                aejdVar.w();
                return;
            case 19:
                defpackage.aejd aejdVar2 = ((defpackage.aejb) this.a).a;
                aejdVar2.f = this.b;
                aejdVar2.w();
                return;
            default:
                com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout expressSignInLayout = (com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout) this.b;
                ahvr.cj(expressSignInLayout.a, "Internal layout should not be null after Express Sign In Layout was initialized()");
                this.a.a(expressSignInLayout.a);
                return;
        }
    }

    public /* synthetic */ aawj(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ aawj(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public aawj(defpackage.aawk aawkVar, com.google.android.gms.wearable.internal.MessageEventParcelable messageEventParcelable, int i) {
        this.$cid = i;
        this.b = messageEventParcelable;
        j$.util.Objects.requireNonNull(aawkVar);
        this.a = aawkVar;
    }

    public aawj(defpackage.aawk aawkVar, com.google.android.gms.wearable.internal.ChannelEventParcelable channelEventParcelable, int i) {
        this.$cid = i;
        this.b = channelEventParcelable;
        j$.util.Objects.requireNonNull(aawkVar);
        this.a = aawkVar;
    }
}
