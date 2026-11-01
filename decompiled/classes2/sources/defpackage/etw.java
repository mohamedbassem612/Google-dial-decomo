package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class etw implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ etw(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.fqn fqnVarE;
        defpackage.fqn fqnVarE2;
        java.lang.Object obj2;
        switch (this.$cid) {
            case 0:
                return new java.lang.IndexOutOfBoundsException((java.lang.String) obj);
            case 1:
                return new java.lang.StringIndexOutOfBoundsException((java.lang.String) obj);
            case 2:
                defpackage.fai faiVar = defpackage.fai.a;
                return new java.util.HashSet();
            case 3:
                return java.lang.Integer.valueOf(java.lang.Integer.bitCount(((java.lang.Integer) obj).intValue()));
            case 4:
                return java.lang.Integer.valueOf(java.lang.Integer.bitCount(((java.lang.Integer) obj).intValue()));
            case 5:
                defpackage.fqn fqnVar = (defpackage.fqn) obj;
                if (fqnVar == null) {
                    return null;
                }
                fqnVarE = defpackage.fpz.e(fqnVar);
                if (fqnVarE == null) {
                    obj2 = fqnVarE;
                    return null;
                }
                break;
            case 6:
                defpackage.fqn fqnVar2 = (defpackage.fqn) obj;
                if (fqnVar2 == null) {
                    return null;
                }
                fqnVarE2 = defpackage.fpz.e(fqnVar2);
                if (fqnVarE2 == null) {
                    obj2 = fqnVarE2;
                    return null;
                }
                break;
            case 7:
                defpackage.ess essVar = (defpackage.ess) obj;
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.CharSequence charSequence = essVar.u;
                if (charSequence != null) {
                    bundle.putCharSequence(defpackage.ess.a, charSequence);
                    if (charSequence instanceof android.text.Spanned) {
                        android.text.Spanned spanned = (android.text.Spanned) charSequence;
                        java.lang.String str = defpackage.esu.a;
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                        for (defpackage.esw eswVar : (defpackage.esw[]) spanned.getSpans(0, spanned.length(), defpackage.esw.class)) {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putString(defpackage.esw.a, eswVar.c);
                            bundle2.putInt(defpackage.esw.b, eswVar.d);
                            arrayList.add(defpackage.esu.a(spanned, eswVar, 1, bundle2));
                        }
                        for (defpackage.esx esxVar : (defpackage.esx[]) spanned.getSpans(0, spanned.length(), defpackage.esx.class)) {
                            android.os.Bundle bundle3 = new android.os.Bundle();
                            bundle3.putInt(defpackage.esx.a, esxVar.d);
                            bundle3.putInt(defpackage.esx.b, esxVar.e);
                            bundle3.putInt(defpackage.esx.c, esxVar.f);
                            arrayList.add(defpackage.esu.a(spanned, esxVar, 2, bundle3));
                        }
                        for (defpackage.esv esvVar : (defpackage.esv[]) spanned.getSpans(0, spanned.length(), defpackage.esv.class)) {
                            arrayList.add(defpackage.esu.a(spanned, esvVar, 3, null));
                        }
                        for (defpackage.esy esyVar : (defpackage.esy[]) spanned.getSpans(0, spanned.length(), defpackage.esy.class)) {
                            android.os.Bundle bundle4 = new android.os.Bundle();
                            bundle4.putString(defpackage.esy.a, esyVar.b);
                            arrayList.add(defpackage.esu.a(spanned, esyVar, 4, bundle4));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle.putParcelableArrayList(defpackage.ess.b, arrayList);
                        }
                    }
                }
                bundle.putSerializable(defpackage.ess.c, essVar.v);
                bundle.putSerializable(defpackage.ess.d, essVar.w);
                bundle.putFloat(defpackage.ess.g, essVar.y);
                bundle.putInt(defpackage.ess.h, essVar.z);
                bundle.putInt(defpackage.ess.i, essVar.A);
                bundle.putFloat(defpackage.ess.j, essVar.B);
                bundle.putInt(defpackage.ess.k, essVar.C);
                bundle.putInt(defpackage.ess.l, essVar.H);
                bundle.putFloat(defpackage.ess.m, essVar.I);
                bundle.putFloat(defpackage.ess.n, essVar.D);
                bundle.putFloat(defpackage.ess.o, essVar.E);
                bundle.putBoolean(defpackage.ess.q, essVar.F);
                bundle.putInt(defpackage.ess.p, essVar.G);
                bundle.putInt(defpackage.ess.r, essVar.J);
                bundle.putFloat(defpackage.ess.s, essVar.K);
                bundle.putInt(defpackage.ess.t, essVar.L);
                android.graphics.Bitmap bitmap = essVar.x;
                obj2 = bundle;
                if (bitmap != null) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    ahvr.bY(bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle.putByteArray(defpackage.ess.f, byteArrayOutputStream.toByteArray());
                    obj2 = bundle;
                }
                break;
            case 8:
                return ((zai) obj).d;
            case 9:
                return (acuh) obj;
            case 10:
                return ((acuh) obj).c;
            case 11:
                try {
                    return (j$.util.Optional) aiql.H((ajcq) obj);
                } catch (java.util.concurrent.ExecutionException e) {
                    a.bq(jvv.a.c(), "Error retrieving tag.", "com/android/dialer/callertags/impl/CallerTagsImpl", "getTagConfig", (char) 236, "CallerTagsImpl.java", e, zct.b);
                    return j$.util.Optional.empty();
                }
            case 12:
                return (zai) ((j$.util.Optional) obj).get();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((zai) obj).b;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return (zai) obj;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return anty.aE(obj);
            case 16:
                return (zai) ((java.util.Map.Entry) obj).getValue();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return java.lang.Long.valueOf(((defpackage.kdy) obj).b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((android.content.ContentValues) obj).getAsLong("timestamp");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.kiw kiwVar = ((kiu) obj).r;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                return java.lang.String.valueOf(kiwVar.t);
            default:
                return obj.toString();
        }
        obj2 = fqnVarE;
        obj2 = fqnVarE2;
        return obj2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
