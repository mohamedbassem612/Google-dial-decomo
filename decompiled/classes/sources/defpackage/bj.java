package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class bj implements defpackage.oi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.bo a;

    public bj(defpackage.bo boVar, int i) {
        this.$cid = i;
        this.a = boVar;
    }

    @Override // defpackage.oi
    public final /* synthetic */ void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.bo boVar = this.a;
            androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
            android.support.v4.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = (android.support.v4.app.FragmentManager.LaunchedFragmentInfo) boVar.u.pollLast();
            if (launchedFragmentInfo == null) {
                toString();
                android.util.Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            defpackage.bu buVar = boVar.c;
            java.lang.String str = launchedFragmentInfo.a;
            defpackage.aw awVarC = buVar.c(str);
            if (awVarC == null) {
                android.util.Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(java.lang.String.valueOf(str)));
                return;
            } else {
                awVarC.ag(launchedFragmentInfo.b, activityResult.a, activityResult.b);
                return;
            }
        }
        if (i != 1) {
            defpackage.bo boVar2 = this.a;
            androidx.activity.result.ActivityResult activityResult2 = (androidx.activity.result.ActivityResult) obj;
            android.support.v4.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfo2 = (android.support.v4.app.FragmentManager.LaunchedFragmentInfo) boVar2.u.pollFirst();
            if (launchedFragmentInfo2 == null) {
                toString();
                android.util.Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            defpackage.bu buVar2 = boVar2.c;
            java.lang.String str2 = launchedFragmentInfo2.a;
            defpackage.aw awVarC2 = buVar2.c(str2);
            if (awVarC2 == null) {
                android.util.Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(java.lang.String.valueOf(str2)));
                return;
            } else {
                awVarC2.ag(launchedFragmentInfo2.b, activityResult2.a, activityResult2.b);
                return;
            }
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((java.lang.Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        defpackage.bo boVar3 = this.a;
        android.support.v4.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfo3 = (android.support.v4.app.FragmentManager.LaunchedFragmentInfo) boVar3.u.pollFirst();
        if (launchedFragmentInfo3 == null) {
            toString();
            android.util.Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        defpackage.bu buVar3 = boVar3.c;
        java.lang.String str3 = launchedFragmentInfo3.a;
        defpackage.aw awVarC3 = buVar3.c(str3);
        if (awVarC3 == null) {
            android.util.Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(java.lang.String.valueOf(str3)));
        } else {
            awVarC3.am(launchedFragmentInfo3.b, strArr, iArr);
        }
    }
}
