package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class v implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public v(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object packageIdentifierParcel;
        byte[] byteArray;
        int i = 0;
        switch (this.$cid) {
            case 0:
                return new android.support.v4.app.BackStackState(parcel);
            case 1:
                return new android.support.v4.app.BackStackRecordState(parcel);
            case 2:
                return new android.support.v4.app.FragmentManager$LaunchedFragmentInfo(parcel);
            case 3:
                return new android.support.v4.app.FragmentManagerState(parcel);
            case 4:
                return new android.support.v4.app.FragmentState(parcel);
            case 5:
                return new android.support.v4.os.ResultReceiver(parcel);
            case 6:
                return new android.support.v7.widget.ActionMenuPresenter$SavedState(parcel);
            case 7:
                return new android.support.v7.widget.AppCompatSpinner$SavedState(parcel);
            case 8:
                return new android.support.v7.widget.LinearLayoutManager.SavedState(parcel);
            case 9:
                return new android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(parcel);
            case 10:
                return new android.support.v7.widget.StaggeredGridLayoutManager.SavedState(parcel);
            case 11:
                aooh.f(parcel, "parcel");
                aooh.f(parcel, "parcel");
                return new androidx.activity.result.ActivityResult(parcel.readInt(), parcel.readInt() != 0 ? (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel) : null);
            case 12:
                aooh.f(parcel, "inParcel");
                aooh.f(parcel, "parcel");
                android.os.Parcelable parcelable = parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
                aooh.c(parcelable);
                return new androidx.activity.result.IntentSenderRequest((android.content.IntentSender) parcelable, (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                android.os.Bundle bundle = parcel.readBundle(getClass().getClassLoader());
                java.lang.String string = bundle.getString("namespace");
                java.lang.String string2 = bundle.getString("id");
                java.lang.String string3 = bundle.getString("schemaType");
                if (string == null || string2 == null || string3 == null) {
                    throw new java.lang.IllegalArgumentException("GenericDocumentParcel bundle doesn't have namespace, id, or schemaType.");
                }
                defpackage.sd sdVar = new defpackage.sd(string, string2, string3);
                java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("parentTypes");
                if (stringArrayList != null) {
                    sdVar.c(stringArrayList);
                }
                sdVar.b = bundle.getInt("score");
                sdVar.a = bundle.getLong("creationTimestampMillis");
                sdVar.d(bundle.getLong("ttlMillis"));
                android.os.Bundle bundle2 = bundle.getBundle("properties");
                if (bundle2 != null) {
                    for (java.lang.String str : bundle2.keySet()) {
                        sdVar.b(str, (androidx.appsearch.safeparcel.PropertyParcel) bundle2.getParcelable(str));
                    }
                }
                return sdVar.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                android.os.Bundle bundle3 = (android.os.Bundle) j$.util.Objects.requireNonNull(parcel.readBundle(getClass().getClassLoader()));
                j$.util.Objects.requireNonNull(bundle3);
                java.lang.String str2 = (java.lang.String) j$.util.Objects.requireNonNull(bundle3.getString("packageName"));
                java.util.ArrayList parcelableArrayList = bundle3.getParcelableArrayList("sha256Certificates");
                if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                    packageIdentifierParcel = new androidx.appsearch.safeparcel.PackageIdentifierParcel(str2, (byte[]) j$.util.Objects.requireNonNull(bundle3.getByteArray("sha256Certificate")), null);
                } else {
                    byte[][] bArr = new byte[parcelableArrayList.size()][];
                    while (i < parcelableArrayList.size()) {
                        android.os.Bundle bundle4 = (android.os.Bundle) parcelableArrayList.get(i);
                        if (bundle4 != null) {
                            bArr[i] = bundle4.getByteArray("sha256Certificate");
                        }
                        i++;
                    }
                    packageIdentifierParcel = new androidx.appsearch.safeparcel.PackageIdentifierParcel(str2, null, bArr);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.os.Bundle bundle5 = parcel.readBundle(getClass().getClassLoader());
                j$.util.Objects.requireNonNull(bundle5);
                java.lang.String string4 = bundle5.getString("propertyName");
                j$.util.Objects.requireNonNull(string4);
                defpackage.sk skVar = new defpackage.sk(string4);
                java.lang.String[] stringArray = bundle5.getStringArray("stringArray");
                long[] longArray = bundle5.getLongArray("longArray");
                double[] doubleArray = bundle5.getDoubleArray("doubleArray");
                boolean[] booleanArray = bundle5.getBooleanArray("booleanArray");
                java.util.ArrayList parcelableArrayList2 = bundle5.getParcelableArrayList("bytesArray");
                android.os.Parcelable[] parcelableArray = bundle5.getParcelableArray("docArray");
                java.util.ArrayList parcelableArrayList3 = bundle5.getParcelableArrayList("embeddingArray");
                if (stringArray != null) {
                    skVar.h(stringArray);
                } else if (longArray != null) {
                    skVar.g(longArray);
                } else if (doubleArray != null) {
                    skVar.e(doubleArray);
                } else if (booleanArray != null) {
                    skVar.b(booleanArray);
                } else if (parcelableArrayList2 != null) {
                    byte[][] bArr2 = new byte[parcelableArrayList2.size()][];
                    while (i < parcelableArrayList2.size()) {
                        android.os.Bundle bundle6 = (android.os.Bundle) parcelableArrayList2.get(i);
                        if (bundle6 != null && (byteArray = bundle6.getByteArray("byteArray")) != null) {
                            bArr2[i] = byteArray;
                        }
                        i++;
                    }
                    skVar.c(bArr2);
                } else if (parcelableArray != null) {
                    int length = parcelableArray.length;
                    androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr = new androidx.appsearch.safeparcel.GenericDocumentParcel[length];
                    java.lang.System.arraycopy(parcelableArray, 0, genericDocumentParcelArr, 0, length);
                    skVar.d(genericDocumentParcelArr);
                } else {
                    if (parcelableArrayList3 == null) {
                        throw new java.lang.IllegalArgumentException("property bundle passed in doesn't have any value set.");
                    }
                    defpackage.pu[] puVarArr = new defpackage.pu[parcelableArrayList3.size()];
                    while (i < parcelableArrayList3.size()) {
                        android.os.Bundle bundle7 = (android.os.Bundle) parcelableArrayList3.get(i);
                        if (bundle7 != null) {
                            float[] floatArray = bundle7.getFloatArray("embeddingValue");
                            java.lang.String string5 = bundle7.getString("embeddingModelSignature");
                            if (floatArray != null && string5 != null) {
                                puVarArr[i] = new defpackage.pu(floatArray, string5);
                            }
                        }
                        i++;
                    }
                    skVar.f(puVarArr);
                }
                return skVar.a();
            case 16:
                packageIdentifierParcel = new androidx.car.app.serialization.Bundleable((android.os.Bundle) j$.util.Objects.requireNonNull(parcel.readBundle(getClass().getClassLoader())));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new androidx.core.widget.NestedScrollView.SavedState(parcel);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new androidx.media3.common.DrmInitData(parcel);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new androidx.media3.common.DrmInitData.SchemeData(parcel);
            default:
                return new androidx.paging.compose.PagingPlaceholderKey(parcel.readInt());
        }
        return packageIdentifierParcel;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new android.support.v4.app.BackStackState[i];
            case 1:
                return new android.support.v4.app.BackStackRecordState[i];
            case 2:
                return new android.support.v4.app.FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new android.support.v4.app.FragmentManagerState[i];
            case 4:
                return new android.support.v4.app.FragmentState[i];
            case 5:
                return new android.support.v4.os.ResultReceiver[i];
            case 6:
                return new android.support.v7.widget.ActionMenuPresenter$SavedState[i];
            case 7:
                return new android.support.v7.widget.AppCompatSpinner$SavedState[i];
            case 8:
                return new android.support.v7.widget.LinearLayoutManager.SavedState[i];
            case 9:
                return new android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
            case 10:
                return new android.support.v7.widget.StaggeredGridLayoutManager.SavedState[i];
            case 11:
                return new androidx.activity.result.ActivityResult[i];
            case 12:
                return new androidx.activity.result.IntentSenderRequest[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new androidx.appsearch.safeparcel.GenericDocumentParcel[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new androidx.appsearch.safeparcel.PackageIdentifierParcel[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new androidx.appsearch.safeparcel.PropertyParcel[i];
            case 16:
                return new androidx.car.app.serialization.Bundleable[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new androidx.core.widget.NestedScrollView.SavedState[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new androidx.media3.common.DrmInitData[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new androidx.media3.common.DrmInitData.SchemeData[i];
            default:
                return new androidx.paging.compose.PagingPlaceholderKey[i];
        }
    }
}
