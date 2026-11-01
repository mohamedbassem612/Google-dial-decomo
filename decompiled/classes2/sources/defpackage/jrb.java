package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jrb extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(aoin aoinVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aoinVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((ztf) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((kid) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                c((aoss) obj, (aoln) obj2).b(aojh.a);
                return null;
            default:
                c((aoss) obj, (aoln) obj2).b(aojh.a);
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object[] objArr;
        java.lang.String packageName;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = false;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                return this.a;
            case 1:
                aooc.af(obj);
                return java.lang.String.valueOf(((android.content.SharedPreferences) this.a.a()).getLong("global_blacklist_version_v2", 0L));
            case 2:
                aooc.af(obj);
                return ((defpackage.jsv) this.a).b;
            case 3:
                aooc.af(obj);
                ?? r0 = this.a;
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r0, 10));
                for (kiu kiuVar : r0) {
                    aokc aokcVar = aokc.a;
                    arrayList.add(new defpackage.kdc(kiuVar, aokcVar, aokcVar));
                }
                return ahvr.bv(arrayList);
            case 4:
                aooc.af(obj);
                int size = this.a.size();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(new java.util.EnumMap(ken.class));
                }
                return arrayList2;
            case 5:
                aooc.af(obj);
                return ((uqz) this.a).c;
            case 6:
                aooc.af(obj);
                uqz uqzVar = (uqz) this.a;
                uqzVar.c = new kex(((kex) uqzVar.c).a + 1);
                return aojh.a;
            case 7:
                aooc.af(obj);
                return this.a;
            case 8:
                aooc.af(obj);
                java.io.File file = new java.io.File(((android.content.Context) ((defpackage.jyn) this.a).d).getFilesDir(), "call_notes_assets");
                file.mkdirs();
                return file;
            case 9:
                aooc.af(obj);
                if (android.os.Build.VERSION.SDK_INT < 33) {
                    defpackage.ksx.a.b().l("com/android/dialer/calloptions/ui/CallOptionsComponentEnabledStateUpdater", "update$<anonymous>", 42, "CallOptionsComponentEnabledStateUpdater.kt").v("Skipping CallOptions component enabled state update: requires API 33+.");
                    return aojh.a;
                }
                defpackage.ksx ksxVar = (defpackage.ksx) this.a;
                if (((java.util.concurrent.atomic.AtomicBoolean) ksxVar.g.c).get() || ((java.util.concurrent.atomic.AtomicBoolean) ksxVar.f.a).get()) {
                    defpackage.ksx.a.b().l("com/android/dialer/calloptions/ui/CallOptionsComponentEnabledStateUpdater", "update$<anonymous>", 54, "CallOptionsComponentEnabledStateUpdater.kt").v("Skipping CallOptions component enabled state update because an activity is active with a dial intent.");
                    return aojh.a;
                }
                android.content.Context context = ksxVar.b;
                android.content.ComponentName componentName = new android.content.ComponentName(context, "com.android.dialer.calloptions.ui.CallOptionsActivity");
                android.content.ComponentName componentName2 = new android.content.ComponentName(context, "com.android.dialer.main.impl.MainActivityDialAlias");
                java.lang.Boolean bool = (java.lang.Boolean) ksxVar.d.a();
                aimz aimzVar = defpackage.ksx.a;
                aimzVar.b().l("com/android/dialer/calloptions/ui/CallOptionsComponentEnabledStateUpdater", "update$<anonymous>", 70, "CallOptionsComponentEnabledStateUpdater.kt").y("Updating CallOptions component enabled states. isEnabled=%b", bool);
                int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(componentName);
                int componentEnabledSetting2 = context.getPackageManager().getComponentEnabledSetting(componentName2);
                if (componentEnabledSetting2 == 1) {
                    objArr = true;
                } else if (componentEnabledSetting2 == 0) {
                    componentEnabledSetting2 = 0;
                    objArr = true;
                } else {
                    objArr = false;
                }
                java.lang.Object[] objArr2 = componentEnabledSetting == 1;
                if (objArr2 != false && objArr != false) {
                    ksxVar.e.o(rmx.Bc);
                }
                if (objArr2 == false && objArr == false) {
                    ksxVar.e.o(rmx.Bb);
                }
                int i2 = true != bool.booleanValue() ? 2 : 1;
                int i3 = true != bool.booleanValue() ? 1 : 2;
                if (componentEnabledSetting == i2 && componentEnabledSetting2 == i3) {
                    return aojh.a;
                }
                ae$.ExternalSyntheticApiModelOutline0.m(context.getPackageManager(), ajsz.bb(new android.content.pm.PackageManager.ComponentEnabledSetting[]{new android.content.pm.PackageManager.ComponentEnabledSetting(componentName, i2, 1), new android.content.pm.PackageManager.ComponentEnabledSetting(componentName2, i3, 1)}));
                aimzVar.b().l("com/android/dialer/calloptions/ui/CallOptionsComponentEnabledStateUpdater", "update$<anonymous>", 123, "CallOptionsComponentEnabledStateUpdater.kt").z("Updated components: CallOptionsActivity=%d, MainActivityDialAlias=%d", i2, i3);
                return aojh.a;
            case 10:
                aooc.af(obj);
                this.a.a();
                return aojh.a;
            case 11:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.lnh) this.a).f.y());
            case 12:
                aooc.af(obj);
                android.content.Intent intent = new android.content.Intent("android.provider.action.QUICK_CONTACT");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(android.provider.ContactsContract.Contacts.CONTENT_URI.buildUpon().appendPath("1").build());
                android.content.ComponentName componentNameResolveActivity = intent.resolveActivity(((defpackage.lny) this.a).c.getPackageManager());
                defpackage.lny.a.b().l("com/android/dialer/chocolatechip/impl/dataservice/QuickContactsAppChecker", "verifyIfContactAppEmbeddable$<anonymous>", 35, "QuickContactsAppChecker.kt").y("componentName : %s", componentNameResolveActivity);
                if (componentNameResolveActivity != null && (packageName = componentNameResolveActivity.getPackageName()) != null && aoov.G(packageName, "com.google.android.contacts", false)) {
                    z2 = true;
                }
                return java.lang.Boolean.valueOf(z2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                ((defpackage.coz) this.a).a();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                akzx akzxVarM = ampn.a.m();
                aooh.f(akzxVarM, "builder");
                defpackage.lrc lrcVar = (defpackage.lrc) this.a;
                ampm ampmVar = lrcVar.b;
                aooh.f(ampmVar, "value");
                akzxVarM.u();
                ampn ampnVar = akzxVarM.b;
                ampnVar.c = ampmVar.e;
                ampnVar.b |= 1;
                akzm akzmVar = lrcVar.c;
                if (akzmVar != null) {
                    akzxVarM.u();
                    ampn ampnVar2 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(akzmVar);
                    ampnVar2.d = akzmVar;
                    ampnVar2.b |= 2;
                }
                java.lang.Integer num = lrcVar.d;
                if (num != null) {
                    int iIntValue = num.intValue();
                    akzxVarM.u();
                    ampn ampnVar3 = akzxVarM.b;
                    ampnVar3.b |= 4;
                    ampnVar3.e = iIntValue;
                }
                java.lang.Integer num2 = lrcVar.e;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    akzxVarM.u();
                    ampn ampnVar4 = akzxVarM.b;
                    ampnVar4.b |= 8;
                    ampnVar4.f = iIntValue2;
                }
                java.lang.Boolean bool2 = lrcVar.f;
                if (bool2 != null) {
                    boolean zBooleanValue = bool2.booleanValue();
                    akzxVarM.u();
                    ampn ampnVar5 = akzxVarM.b;
                    ampnVar5.b |= 16;
                    ampnVar5.g = zBooleanValue;
                }
                ampn ampnVarP = akzxVarM.p();
                aooh.e(ampnVarP, "build(...)");
                return ampnVarP;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                try {
                    android.content.pm.PackageInfo packageInfo = ((defpackage.lvf) this.a).b.getPackageManager().getPackageInfo("com.google.android.contacts", 0);
                    android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo == null || !applicationInfo.enabled) {
                        defpackage.lvf.a.b().l("com/android/dialer/contactringtones/settings/impl/ContactRingtonesSettingsIntegration", "isContactRingtonesExposed$<anonymous>", 71, "ContactRingtonesSettingsIntegration.kt").v("Contacts app is installed but disabled, not showing contact ringtones setting");
                        return java.lang.Boolean.FALSE;
                    }
                    long jM = ft$.ExternalSyntheticApiModelOutline0.m(packageInfo);
                    if (jM < 3176439) {
                        defpackage.lvf.a.b().l("com/android/dialer/contactringtones/settings/impl/ContactRingtonesSettingsIntegration", "isContactRingtonesExposed$<anonymous>", 78, "ContactRingtonesSettingsIntegration.kt").x("Intent is not available on versionCode %d, not showing contact ringtones setting", jM);
                        return java.lang.Boolean.FALSE;
                    }
                    z = true;
                    return java.lang.Boolean.valueOf(z);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    defpackage.lvf.a.b().l("com/android/dialer/contactringtones/settings/impl/ContactRingtonesSettingsIntegration", "isContactRingtonesExposed$<anonymous>", 86, "ContactRingtonesSettingsIntegration.kt").v("Contacts app is not installed, not showing contact ringtones setting");
                }
                break;
            case 16:
                aooc.af(obj);
                int size2 = this.a.size();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(size2);
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList3.add(new java.util.EnumMap(lzk.class));
                }
                return arrayList3;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooc.af(obj);
                ((defpackage.lzt) this.a).d = true;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooc.af(obj);
                return ((maw) this.a).d;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooc.af(obj);
                defpackage.mdh mdhVar = (defpackage.mdh) this.a;
                if (mdhVar.b) {
                    return null;
                }
                mdhVar.a.b(mce.R);
                return null;
            default:
                aooc.af(obj);
                ((defpackage.mdh) this.a).b = true;
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.jrb((ztf) this.a, aolnVar, 0);
            case 1:
                return new defpackage.jrb((aoin) this.a, aolnVar, 1);
            case 2:
                return new defpackage.jrb(aolnVar, (defpackage.jsv) this.a, 2);
            case 3:
                return new defpackage.jrb((java.util.List) this.a, aolnVar, 3);
            case 4:
                return new defpackage.jrb((java.util.List) this.a, aolnVar, 4, (byte[]) null);
            case 5:
                return new defpackage.jrb((uqz) this.a, aolnVar, 5);
            case 6:
                return new defpackage.jrb((uqz) this.a, aolnVar, 6, (byte[]) null);
            case 7:
                return new defpackage.jrb((kid) this.a, aolnVar, 7);
            case 8:
                return new defpackage.jrb((defpackage.jyn) this.a, aolnVar, 8);
            case 9:
                return new defpackage.jrb((defpackage.ksx) this.a, aolnVar, 9);
            case 10:
                return new defpackage.jrb((aomy) this.a, aolnVar, 10);
            case 11:
                return new defpackage.jrb((defpackage.lnh) this.a, aolnVar, 11);
            case 12:
                return new defpackage.jrb((defpackage.lny) this.a, aolnVar, 12);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.jrb((defpackage.coz) this.a, aolnVar, 13);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.jrb((defpackage.lrc) this.a, aolnVar, 14);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.jrb((defpackage.lvf) this.a, aolnVar, 15);
            case 16:
                return new defpackage.jrb((java.util.List) this.a, aolnVar, 16, (char[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.jrb((defpackage.lzt) this.a, aolnVar, 17);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new defpackage.jrb((maw) this.a, aolnVar, 18);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new defpackage.jrb((defpackage.mdh) this.a, aolnVar, 19);
            default:
                return new defpackage.jrb((defpackage.mdh) this.a, aolnVar, 20, (byte[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(aoln aolnVar, defpackage.jsv jsvVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jsvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(aomy aomyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aomyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.coz cozVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = cozVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(java.util.List list, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(java.util.List list, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.jyn jynVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(kid kidVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = kidVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.ksx ksxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ksxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.lnh lnhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lnhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.lny lnyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lnyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.lrc lrcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lrcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.lvf lvfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lvfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.lzt lztVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lztVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(maw mawVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = mawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.mdh mdhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = mdhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(defpackage.mdh mdhVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = mdhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(uqz uqzVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uqzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(uqz uqzVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uqzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(ztf ztfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ztfVar;
    }
}
