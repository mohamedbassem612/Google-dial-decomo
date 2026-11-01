package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aokw extends defpackage.aoky implements java.util.Iterator, defpackage.aoow {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        a();
        defpackage.aola aolaVar = this.a;
        int i = this.b;
        if (i >= aolaVar.e) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        aokx aokxVar = new aokx(aolaVar, i);
        b();
        return aokxVar;
    }
}
