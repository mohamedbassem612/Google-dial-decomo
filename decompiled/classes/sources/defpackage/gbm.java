package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbm extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.abvp abvpVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abvpVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.gbm) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 1:
                c((defpackage.aoxi) obj, (defpackage.aoln) obj2);
                defpackage.aojh aojhVar = defpackage.aojh.a;
                defpackage.aooc.af(aojhVar);
                return aojhVar;
            case 2:
                return ((defpackage.gbm) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 3:
                return ((defpackage.gbm) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 4:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 5:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 9:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 10:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 11:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            default:
                return ((defpackage.gbm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v15, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18, types: [aonj, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Class cls;
        int i = 2;
        z = false;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                defpackage.aooc.af(obj);
                defpackage.gbn gbnVar = (defpackage.gbn) this.a;
                gbnVar.i.b(new java.lang.Integer(gbnVar.g));
                return defpackage.aojh.a;
            case 1:
                defpackage.aooc.af(obj);
                return defpackage.aojh.a;
            case 2:
                defpackage.aooc.af(obj);
                defpackage.gbn gbnVar2 = (defpackage.gbn) this.a;
                gbnVar2.h.b(new java.lang.Integer(gbnVar2.f));
                return defpackage.aojh.a;
            case 3:
                defpackage.aooc.af(obj);
                ((defpackage.gfn) this.a).f.incrementAndGet();
                return defpackage.aojh.a;
            case 4:
                defpackage.aooc.af(obj);
                defpackage.men menVar = (defpackage.men) this.a;
                android.content.Context context = menVar.b;
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                for (defpackage.meg megVar : defpackage.meg.values()) {
                    ((defpackage.aimw) defpackage.men.a.b().l("com/android/dialer/darpa/impl/DarpaComponentEnabledStateUpdater", "update$<anonymous>", 38, "DarpaComponentEnabledStateUpdater.kt")).y("update %s", megVar.name() + ':' + menVar.a(megVar));
                    int iOrdinal = megVar.ordinal();
                    if (iOrdinal == 0) {
                        cls = com.android.dialer.darpa.impl.AdvancedProtectionCallerIdAndSpamUnusedActivity.class;
                    } else if (iOrdinal == 1) {
                        cls = com.android.dialer.darpa.impl.AdvancedProtectionSpamBlockingUnusedActivity.class;
                    } else {
                        if (iOrdinal != 2) {
                            throw new defpackage.aois();
                        }
                        cls = com.android.dialer.darpa.impl.AdvancedProtectionAutoScreeningUnusedActivity.class;
                    }
                    packageManager.setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) cls), menVar.a(megVar), 1);
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.aooc.af(obj);
                try {
                    java.lang.Object obj2 = this.a;
                    if (ft$.ExternalSyntheticApiModelOutline0.m(((defpackage.olc) obj2).h.getPackageInfo("com.google.android.apps.tachyon", 0)) <= ((java.lang.Number) ((defpackage.olc) obj2).e.a()).longValue()) {
                        z = true;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.olc.a.b()).k(e).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "getIsLegacyMeetClientUsedInternal$<anonymous>", 255, "DialerMeetLibraryImpl.kt")).v("failed to check whether Meet is on legacy client since Meet is not installed");
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(obj);
                j$.util.Optional optionalG = ((defpackage.rpa) this.a).l.g();
                defpackage.okr okrVar = new defpackage.okr(new defpackage.rou(1), i);
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(okrVar.a.a(optionalG.get()));
                }
                defpackage.aooh.e(optionalG, "map(...)");
                if (optionalG == null) {
                    defpackage.aooh.i("<this>");
                }
                java.lang.Boolean bool = (java.lang.Boolean) optionalG.orElse((java.lang.Object) null);
                return java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aooc.af(obj);
                j$.util.Optional optionalG2 = ((defpackage.rpa) this.a).l.g();
                defpackage.okr okrVar2 = new defpackage.okr(new defpackage.rou(0), 3);
                if (true == optionalG2.isPresent()) {
                    optionalG2 = j$.util.Optional.ofNullable(okrVar2.a.a(optionalG2.get()));
                }
                defpackage.aooh.e(optionalG2, "map(...)");
                if (optionalG2 == null) {
                    defpackage.aooh.i("<this>");
                }
                java.lang.Boolean bool2 = (java.lang.Boolean) optionalG2.orElse((java.lang.Object) null);
                return java.lang.Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.vnj) this.a).c.m());
            case 9:
                defpackage.aooc.af(obj);
                return ((defpackage.zjs) this.a).s();
            case 10:
                defpackage.aooc.af(obj);
                return ((defpackage.zjs) this.a).t();
            case 11:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.zjs) this.a).y());
            default:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.abvp) this.a).g());
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.gbm((defpackage.gbn) this.a, aolnVar, 0);
            case 1:
                return new defpackage.gbm((defpackage.aogc) this.a, aolnVar, 1);
            case 2:
                return new defpackage.gbm((defpackage.gbn) this.a, aolnVar, 2, (byte[]) null);
            case 3:
                return new defpackage.gbm((defpackage.gfn) this.a, aolnVar, 3);
            case 4:
                return new defpackage.gbm((defpackage.men) this.a, aolnVar, 4);
            case 5:
                return new defpackage.gbm((defpackage.olc) this.a, aolnVar, 5);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.gbm((defpackage.rpa) this.a, aolnVar, 6);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.gbm((defpackage.rpa) this.a, aolnVar, 7, (byte[]) null);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.gbm((defpackage.vnj) this.a, aolnVar, 8);
            case 9:
                return new defpackage.gbm((defpackage.zjs) this.a, aolnVar, 9);
            case 10:
                return new defpackage.gbm((defpackage.zjs) this.a, aolnVar, 10, (byte[]) null);
            case 11:
                return new defpackage.gbm((defpackage.zjs) this.a, aolnVar, 11, (char[]) null);
            default:
                return new defpackage.gbm((defpackage.abvp) this.a, aolnVar, 12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.aogc aogcVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aogcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.gbn gbnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = gbnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.gbn gbnVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = gbnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.gfn gfnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = gfnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.men menVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = menVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.olc olcVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = olcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.rpa rpaVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rpaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.rpa rpaVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rpaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.vnj vnjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = vnjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }
}
