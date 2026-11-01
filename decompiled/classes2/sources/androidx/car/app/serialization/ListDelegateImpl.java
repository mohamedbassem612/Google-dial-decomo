package androidx.car.app.serialization;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ListDelegateImpl implements defpackage.aaw {
    private int _size;
    private int listHashCode;
    private androidx.car.app.serialization.IRemoteList mStub;

    /* JADX INFO: compiled from: PG */
    public final class RemoteListStub extends androidx.car.app.serialization.IRemoteList.Stub {
        private final java.util.List mContent;

        public RemoteListStub(java.util.List list) {
            aooh.f(list, "mContent");
            this.mContent = list;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public void requestItemRange(final int i, final int i2, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            aooh.f(iOnDoneCallback, "callback");
            defpackage.rx.f(iOnDoneCallback, "lazy load content", new defpackage.abc() { // from class: aax
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.mContent.subList(i, i2 + 1);
                }
            });
        }
    }

    public ListDelegateImpl(java.util.List list) {
        aooh.f(list, "content");
        this._size = -1;
        this.listHashCode = -1;
        this._size = list.size();
        this.listHashCode = list.hashCode();
        this.mStub = new androidx.car.app.serialization.ListDelegateImpl.RemoteListStub(list);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.car.app.serialization.ListDelegateImpl) && ((androidx.car.app.serialization.ListDelegateImpl) obj).listHashCode == this.listHashCode;
    }

    public int getSize() {
        return this._size;
    }

    public int hashCode() {
        return this.listHashCode;
    }

    public void requestItemRange(int i, int i2, defpackage.tz tzVar) {
        aooh.f(tzVar, "callback");
        try {
            androidx.car.app.serialization.IRemoteList iRemoteList = this.mStub;
            if (iRemoteList == null) {
                aooh.j("mStub");
                iRemoteList = null;
            }
            iRemoteList.requestItemRange(i, i2, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.lang.String toString() {
        return "ListDelegate { Size: " + getSize() + ", listHashCode: " + this.listHashCode + " }";
    }

    private ListDelegateImpl() {
        this._size = -1;
        this.listHashCode = -1;
    }
}
