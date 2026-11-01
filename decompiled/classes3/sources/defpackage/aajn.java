package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aajn {
    private static final android.os.Bundle[] a = new android.os.Bundle[0];
    private final ahzi b;
    private int c = 0;
    private j$.time.Instant d;

    public aajn(ahzi ahziVar, j$.time.Instant instant) {
        j$.time.Instant instant2 = j$.time.Instant.EPOCH;
        this.b = ahziVar;
        this.d = instant;
    }

    public final synchronized java.lang.String a() {
        android.os.Bundle[] bundleArr;
        java.lang.String strValueOf;
        java.lang.String str;
        java.lang.String strEncodeToString;
        android.os.Bundle bundle;
        this.c++;
        j$.time.Instant instantD = aiyy.d();
        j$.time.Instant instant = this.d;
        java.lang.Integer num = 0;
        if (this.c - 1 > 0) {
            ahzi ahziVar = this.b;
            bundleArr = (android.os.Bundle[]) ((defpackage.aiep) ahziVar.eZ()).toArray(new android.os.Bundle[((defpackage.aiep) ahziVar.eZ()).size()]);
        } else {
            bundleArr = a;
        }
        int i = this.c;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("vs", 1);
        if (instantD != null) {
            bundle2.putLong("stsc", instantD.toEpochMilli());
        }
        if (instant != null) {
            bundle2.putLong("stsp", instant.toEpochMilli());
        }
        num.getClass();
        bundle2.putInt("cemp", 0);
        num.getClass();
        bundle2.putInt("cef", 0);
        if (bundleArr != null) {
            bundle2.putParcelableArray("sei", bundleArr);
        }
        num.getClass();
        bundle2.putInt("cempg", 0);
        numValueOf.getClass();
        bundle2.putInt("cesg", i);
        num.getClass();
        bundle2.putInt("cefg", 0);
        java.lang.String strV = defpackage.ahus.v(bundle2, "stsc");
        java.lang.String strV2 = defpackage.ahus.v(bundle2, "stsp");
        java.lang.String strU = defpackage.ahus.u(bundle2, "cemp");
        java.lang.String strU2 = defpackage.ahus.u(bundle2, "cef");
        if (bundle2.containsKey("sei")) {
            android.os.Parcelable[] parcelableArray = android.os.Build.VERSION.SDK_INT >= 33 ? (android.os.Parcelable[]) bundle2.getParcelableArray("sei", android.os.Bundle.class) : bundle2.getParcelableArray("sei");
            strValueOf = parcelableArray == null ? "<null array>" : java.lang.String.valueOf(parcelableArray.length);
        } else {
            strValueOf = "<not set>";
        }
        java.lang.String strU3 = defpackage.ahus.u(bundle2, "cempg");
        java.lang.String strU4 = defpackage.ahus.u(bundle2, "cesg");
        java.lang.String strU5 = defpackage.ahus.u(bundle2, "cefg");
        if (bundle2.containsKey("e")) {
            str = "'" + bundle2.getString("e") + '\'';
        } else {
            str = "<not set>";
        }
        android.util.Log.d("DGInteractionStateBundleBuilder", "Built the following Interaction State Bundle:\n - BUNDLE_SCHEMA_VERSION: 1\n - CURRENT_SNAPSHOT_TIMESTAMP: " + strV + "\n - PREVIOUS_SNAPSHOT_TIMESTAMP: " + strV2 + "\n - PROCESSED_MOTION_EVENT_COUNT: " + strU + "\n - FILTERED_EVENT_COUNT: " + strU2 + "\n - EVENTS.length: " + strValueOf + "\n - GLOBAL_PROCESSED_MOTION_EVENT_COUNT: " + strU3 + "\n - GLOBAL_SNAPSHOT_EVENT_COUNT: " + strU4 + "\n - GLOBAL_FILTERED_EVENT_COUNT: " + strU5 + "\n - ERROR: " + str);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeBundle(bundle2);
            strEncodeToString = android.util.Base64.encodeToString(parcelObtain.marshall(), 0);
            parcelObtain.recycle();
            if (strEncodeToString == null) {
                android.util.Log.d("DGEventCollector", "processSnapshotEvent(): Failed to serialize the interaction events.");
            } else {
                android.util.Log.d("DGEventCollector", "processSnapshotEvent(): Successfully serialized the interaction events.");
            }
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("t", 2);
            if (instantD != null) {
                bundle3.putLong("stp", instantD.toEpochMilli());
            }
            java.lang.String string = (bundle3.containsKey("stp") ? java.lang.Long.valueOf(bundle3.getLong("stp")) : "<not set>").toString();
            int iAQ = a.aQ(bundle3.getInt("t"));
            android.util.Log.d("DGInteractionEventBundleBuilder", "Built the following Interaction Event Bundle:\n - PROCESSING_TIMESTAMP:" + string + "\n - TYPE: " + (iAQ != 0 ? java.lang.Integer.toString(iAQ - 1) : "null") + "\n - MOTION_EVENT: " + (true != bundle3.containsKey("em") ? "<not set>" : "<set>"));
            defpackage.aiep aiepVar = (defpackage.aiep) this.b.eZ();
            if (aiepVar.b() == 0 && (bundle = (android.os.Bundle) aiepVar.poll()) != null && bundle.getInt("t") == 1) {
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) dpe.t(bundle, "em", android.view.MotionEvent.class);
                if (motionEvent == null) {
                    android.util.Log.d("DGEventCollector", "maybeRecycleEvent(): The Bundle contained a MotionEvent, but it was null. This should never happen.");
                } else {
                    motionEvent.recycle();
                }
            }
            aiepVar.add(bundle3);
            this.d = instantD;
        } catch (java.lang.Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
        return strEncodeToString;
    }
}
