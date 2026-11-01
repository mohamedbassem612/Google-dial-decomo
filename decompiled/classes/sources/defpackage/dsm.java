package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dsm extends defpackage.aoof implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, byte[] bArr) {
        super(1, obj, defpackage.amk.class, "onFocusChange", "onFocusChange(Z)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0239 A[LOOP:2: B:77:0x01f1->B:90:0x0239, LOOP_END] */
    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.aosy) this.e).a((defpackage.aoln) obj);
            case 1:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.amk amkVar = (defpackage.amk) this.e;
                if (zBooleanValue) {
                    amkVar.k();
                } else {
                    if (amkVar.i != null) {
                        defpackage.acx acxVar = amkVar.h;
                        java.lang.Object[] objArr = acxVar.c;
                        long[] jArr = acxVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = i - length;
                                    int i3 = 0;
                                    while (true) {
                                        int i4 = 8 - ((~i2) >>> 31);
                                        if (i3 < i4) {
                                            if ((255 & j) < 128) {
                                                defpackage.aoov.an(amkVar.M(), null, 0, new amg(amkVar, (defpackage.avl) objArr[(i << 3) + i3], (defpackage.aoln) null, 6), 3);
                                            }
                                            j >>= 8;
                                            i3++;
                                        } else if (i4 == 8) {
                                            if (i != length) {
                                                i++;
                                            }
                                        }
                                    }
                                } else if (i != length) {
                                    i++;
                                }
                            }
                        }
                        defpackage.avl avlVar = amkVar.g;
                        if (avlVar != null) {
                            defpackage.aoov.an(amkVar.M(), null, 0, new amg(amkVar, avlVar, (defpackage.aoln) null, 7, (byte[]) null), 3);
                        }
                    }
                    amkVar.h.g();
                    amkVar.g = null;
                    amkVar.m();
                }
                return defpackage.aojh.a;
            case 2:
                java.util.Set set = (java.util.Set) obj;
                if (set == null) {
                    defpackage.aooh.i("p0");
                }
                defpackage.gfn gfnVar = (defpackage.gfn) this.e;
                java.util.concurrent.locks.ReentrantLock reentrantLock = gfnVar.e;
                reentrantLock.lock();
                try {
                    java.util.List listBZ = defpackage.ajsz.bZ(gfnVar.d.values());
                    reentrantLock.unlock();
                    java.util.Iterator it = listBZ.iterator();
                    if (!it.hasNext()) {
                        return defpackage.aojh.a;
                    }
                    defpackage.ils ilsVar = (defpackage.ils) it.next();
                    if (set == null) {
                        defpackage.aooh.i("invalidatedTablesIds");
                    }
                    java.lang.Object obj2 = ilsVar.a;
                    throw null;
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 3:
                ((java.lang.Number) obj).intValue();
                defpackage.hrj hrjVar = (defpackage.hrj) this.e;
                int i5 = defpackage.hrj.d;
                hrjVar.c.i(defpackage.aoov.an(hrjVar.a, null, 0, new defpackage.dgz(hrjVar, (defpackage.aoln) null, 13, (byte[]) null), 3));
                return defpackage.aojh.a;
            case 4:
                defpackage.kav kavVar = (defpackage.kav) obj;
                if (kavVar == null) {
                    defpackage.aooh.i("p0");
                }
                defpackage.kaw kawVar = (defpackage.kaw) this.e;
                if (kavVar == null) {
                    defpackage.aooh.i("loggingContext");
                }
                defpackage.ailj it2 = ((defpackage.aihd) kawVar.a).iterator();
                defpackage.aooh.e(it2, "iterator(...)");
                while (it2.hasNext()) {
                    ((defpackage.kau) it2.next()).c(kavVar);
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.kav kavVar2 = (defpackage.kav) obj;
                if (kavVar2 == null) {
                    defpackage.aooh.i("p0");
                }
                defpackage.kaw kawVar2 = (defpackage.kaw) this.e;
                if (kavVar2 == null) {
                    defpackage.aooh.i("loggingContext");
                }
                defpackage.ailj it3 = ((defpackage.aihd) kawVar2.a).iterator();
                defpackage.aooh.e(it3, "iterator(...)");
                while (it3.hasNext()) {
                    ((defpackage.kau) it3.next()).a(kavVar2);
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                gpm gpmVar = (gpm) obj;
                defpackage.aooh.f(gpmVar, "p0");
                defpackage.rkg rkgVar = (defpackage.rkg) this.e;
                defpackage.aimz aimzVar = defpackage.rkg.a;
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "splitAttributeCalculate", 218, "ActivityEmbedding.kt")).y("params: %s", gpmVar);
                android.content.res.Configuration configuration = gpmVar.a;
                boolean z = gpmVar.c;
                defpackage.gpl gplVar = gpmVar.b;
                defpackage.aooh.f(configuration, "parentConfiguration");
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "splitOnLandscape", 238, "ActivityEmbedding.kt")).w("orientation: %s", configuration.orientation);
                if (rkgVar.d.g().isEmpty()) {
                    int i6 = configuration.orientation;
                    if (!z || i6 == 1) {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "splitOnLandscape", 252, "ActivityEmbedding.kt")).v("Constraints aren't satisfied or portrait, return Expand split type");
                        defpackage.gph gphVar = new defpackage.gph();
                        gphVar.b(defpackage.gpk.a);
                        return gphVar.a();
                    }
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "splitOnLandscape", 257, "ActivityEmbedding.kt")).v("Landscape, return Default split attr");
                } else {
                    if (!z) {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "splitOnLandscape", 241, "ActivityEmbedding.kt")).v("Constraints aren't satisfied, return Expand split type");
                        defpackage.gph gphVar2 = new defpackage.gph();
                        gphVar2.b(defpackage.gpk.a);
                        return gphVar2.a();
                    }
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "splitOnLandscape", 246, "ActivityEmbedding.kt")).v("Return Default split attr");
                }
                return gplVar;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.ugu) this.e).a((defpackage.aoln) obj);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                long jLongValue = ((java.lang.Number) obj).longValue();
                defpackage.unb unbVar = (defpackage.unb) this.e;
                unbVar.c.o(defpackage.rmx.FAVORITES_BAR_REMOVE_CONTACT_CLICKED);
                defpackage.aoov.an(unbVar.d, null, 0, new atg(unbVar, jLongValue, (defpackage.aoln) null, 20), 3);
                return defpackage.aojh.a;
            default:
                java.lang.String str = (java.lang.String) obj;
                if (str == null) {
                    defpackage.aooh.i("p0");
                }
                return ((defpackage.ahbt) this.e).a(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i) {
        super(1, obj, defpackage.aosy.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, char[] cArr) {
        super(1, obj, defpackage.gfn.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, short[] sArr) {
        super(1, obj, defpackage.hrj.class, "androidAutoConnectedStateChangeCallback", "androidAutoConnectedStateChangeCallback(I)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, int[] iArr) {
        super(1, obj, defpackage.kaw.class, "onScreenShown", "onScreenShown(Lcom/android/dialer/calllog/compose/events/CallLogScreenLoggingContext;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, boolean[] zArr) {
        super(1, obj, defpackage.kaw.class, "onInteractive", "onInteractive(Lcom/android/dialer/calllog/compose/events/CallLogScreenLoggingContext;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, float[] fArr) {
        super(1, obj, defpackage.rkg.class, "splitAttributeCalculate", "splitAttributeCalculate(Landroidx/window/embedding/SplitAttributesCalculatorParams;)Landroidx/window/embedding/SplitAttributes;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, byte[][] bArr) {
        super(1, obj, defpackage.ugu.class, "isAvailable", "isAvailable(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, char[][] cArr) {
        super(1, obj, defpackage.unb.class, "unstarContact", "unstarContact(J)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(java.lang.Object obj, int i, short[][] sArr) {
        super(1, obj, defpackage.ahbt.class, "create", "create(Ljava/lang/String;)Lcom/google/apps/tiktok/experiments/phenotype/DeviceConfigurationCommitter;", 0);
        this.$cid = i;
    }
}
