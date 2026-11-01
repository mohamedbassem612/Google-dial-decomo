package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agrv {
    public final albh a;
    public com.google.apps.tiktok.cache.ParcelableKeyValueStore b;

    public agrv(albh albhVar) {
        this.a = ((alad) albhVar).r();
    }

    public final void a() {
        ahvr.bZ(this.b != null, "InstanceStateStore can only be accessed after onCreate() has run.");
    }

    public final void b(albh albhVar, albh albhVar2) {
        a();
        ahvr.cj(albhVar, "Cannot write to store with a null key");
        ahvr.cj(albhVar2, "Cannot write to store with a null value");
        apjb apjbVar = new apjb(albhVar2, j$.time.Instant.now());
        com.google.apps.tiktok.cache.ParcelableKeyValueStore parcelableKeyValueStore = this.b;
        synchronized (parcelableKeyValueStore.a) {
            parcelableKeyValueStore.a(albhVar);
            parcelableKeyValueStore.b.put(albhVar, apjbVar);
        }
    }
}
