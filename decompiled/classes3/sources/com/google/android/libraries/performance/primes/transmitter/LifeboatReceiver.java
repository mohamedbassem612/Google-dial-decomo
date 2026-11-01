package com.google.android.libraries.performance.primes.transmitter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LifeboatReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            ahvr.ci(byteArrayExtra);
            try {
                defpackage.aevu aevuVarB = alad.B(defpackage.aevu.a, byteArrayExtra, akzq.a());
                android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                ahvr.ci(stringArrayExtra);
                java.util.ArrayList arrayList = new java.util.ArrayList(stringArrayExtra.length);
                for (java.lang.String str : stringArrayExtra) {
                    try {
                        java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter) declaredConstructor.newInstance(null)).a(context, aevuVarB));
                    } catch (java.lang.Throwable th) {
                        android.util.Log.e("PrimesLifeboatReceiver", java.lang.String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                ajcq ajcqVarF = aiql.F(arrayList);
                j$.util.Objects.requireNonNull(pendingResultGoAsync);
                ajcqVarF.c(new aetv(pendingResultGoAsync, 10), ajbm.a);
            } catch (alaz e) {
                android.util.Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
